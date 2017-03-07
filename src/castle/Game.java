package castle;


import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private HashMap<String,Handler> handlers=new HashMap<String,Handler>();
    private HashMap<Room,Character> character=new HashMap<Room,Character>();
    public Game() {
    	handlers.put("bye", new HandlerBye(this));
    	handlers.put("help", new HandlerHelp(this));
    	handlers.put("go", new HandlerGo(this));
        createRooms();
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;
      
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        character.put(outside, new Monster(this));
        character.put(lobby, new Senior(this));
        character.put(pub, new Warrior(this));
        character.put(study, new Emperor(this));
        character.put(bedroom, new Princess(this));
        //	初始化房间的出口
        outside.setExit("east", lobby);
        outside.setExit("south", study);
        outside.setExit("west", pub);
        lobby.setExit("west", outside);
        pub.setExit("east", outside);
        study.setExit("north",outside);
        study.setExit("east", bedroom);
        bedroom.setExit("west", study);
        lobby.setExit("up", pub);
        pub.setExit("down", lobby);
        pub.setExit("up", study);
        currentRoom = outside;  //	从城堡门外开始
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("你来到了一个城堡，你梦想娶公主作为你的妻子。");
        System.out.println("但是，你对这个城堡一无所知，你将用你的优秀品质找到公主，让她爱上你。");
        System.out.println("巨大的城堡就像是一个迷宫，漫无目的的寻找只会让你迷失在其中。");
        System.out.println("只有诚实和善良的人才能最快地找到公主。");
        System.out.println("游戏即将开始，如果需要帮助，请输入 'help' 。");
        System.out.println();
//        showPrompt();
    }

    // 以下为用户命令
    public void goRoom(String direction) 
    {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }
	
    public void showPrompt(){
        System.out.print("出口有: ");
        System.out.print(currentRoom.getExitDesc());
        System.out.println();
    }
    public void play(){
		Scanner in = new Scanner(System.in);
		boolean goON=true;
    	int count=1;
		while(goON){

	        while ( true ) {
	//    		显示该房间的对话

	        	System.out.println("***"+"你在" +currentRoom+"***");
	    		Character chara;
	    		chara=character.get(currentRoom);
	    			chara.print();
	    		String answer=in.nextLine();
	    		if(answer.equals("yes") ){
	    			if(count==chara.count()){
	            		count++;	
	    			}

	    			if(chara.count()+1==count){
	        			chara.info();	

	            		if(count==6){
	            			goON=false;
	            			break;
	            		}
	            		showPrompt();
	    			}
	    			else if(count>chara.count()+1){
            			chara.reply();
            			showPrompt();
            		}
	    			if(count<chara.count()){
	    				chara.lieReply();
	    				break;
	    			}
	
	    		}else if(answer.equals("no")){
	    			showPrompt();
	    		}else{
	    			System.out.println("错误的输入，请正确输入。");
	    			break;
	    		}
				String line = in.nextLine();
	    		String[] words = line.split(" ");
	    		Handler handler = handlers.get(words[0]);
	    		String value="";
	    		if(words.length>1){
	    			value = words[1];
	    		}
	    		if(handler!=null){
	    			handler.doCmd(value);
	    			if(handler.isBye()){
	    				goON=false;
	    				break;
	    			}
	    		}
	        }
		}
		in.close();
    }
	public static void main(String[] args) {
		Game game = new Game();
		game.printWelcome();
		game.play();       
        System.out.println("感谢您的光临。再见！");
	}
}

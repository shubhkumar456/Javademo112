package javamethods;

public class Whatsapp {
    String name;
    int pages;
    double charges;
    /*messenger,media,group chat,video call,status*/
    public void messenger(){
        System.out.println("we can send or recieve message through this platform");
    }
    public void media() {
        System.out.println("we can easily share media files like fotos, videos, audios, documents etc.");
    }
    public void groupchat(){
        System.out.println("we can easily create a group to do a group chat");
    }
    public void videocall(){
        System.out.println("we can do multiple people video call easily");
    }
    public void status(){
        System.out.println("we can easily share our thoughts through status");
    }

    public static void main(String[] args) {
        Whatsapp obj = new Whatsapp();
           obj.media();
           obj.status();
           obj.groupchat();
           obj.videocall();
           obj.messenger();
    }
}

interface  sound {
    public void soundup(int level) ;
    public void sounddown(int level);
}

class tv implements sound {
    private  int sndlevel;
    public tv() {
        sndlevel = 0;
    }
    public void soundup(int level) {
        sndlevel += level;
    }
    public void sounddown(int level) {
        sndlevel -= level;
        if(sndlevel < 0) sndlevel = 0;
    }
}
class radio implements  sound {
    private  int sndlevel;
    public radio() {

        sndlevel = 0;
    }
    public void soundup(int level) {
        sndlevel += level;
    }
    public void sounddown(int level){
        sndlevel -= level;
        if(sndlevel < 0) sndlevel = 0;
    }

}


public class soundexam {
    public static void main(String[] args) {
        sound radio = new radio();
        sound tv = new tv();
        radio.soundup(5);

    }
}

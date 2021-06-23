package School_textbook;

interface sound96 {
	public void soundup(int level);
	public void sounddown(int level);                             
}
class tv96 implements sound96 {
	private int sndlevel;
	public tv96() {
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

class radio96 implements sound96 {
	private int sndlevel;
	public radio96() {
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


public class p96_SoundExam {

	public static void main(String[] args) {
		sound96 radio = new radio96();
		sound96 tv = new tv96();
		radio.soundup(5);
		tv.soundup(5);

	}

}

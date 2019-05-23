package Behavior.Observer;

interface Observer {
	 public void update();
	}
	class FileObserver implements Observer {
	 FileObserver(File f){
	 f.attach(this);
	 _subject = f;
	 }
	 public void update(){
	 System.out.println("file " +
	 _subject.getAbsoluteName() +
	 " has changed.");
	 }
	 private File _subject;
	}
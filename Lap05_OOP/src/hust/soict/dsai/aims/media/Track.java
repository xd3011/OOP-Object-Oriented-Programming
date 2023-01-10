package hust.soict.dsai.aims.media;

import javax.swing.JDialog;
import javax.swing.JLabel;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable{
	private String title;
	private int length;
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public void play() throws PlayerException {
		// TODO Auto-generated method stub
		if (this.getLength() > 0) {
			JDialog dialog = new JDialog();
			dialog.setSize(300, 200);

			// create Label
			JLabel text = new JLabel("Track - Title : " + this.getTitle() + " Length : " + this.getLength());
			dialog.add(text);
			dialog.setTitle("Play Track");
			dialog.setVisible(true);
		} else
			throw new PlayerException("ERROR : Track length is non-positive");
	}
	
	@Override
	public boolean equals(Object o) {
		Track tmp = (Track)o;
		if(this.getTitle() == tmp.getTitle() && this.getLength() == tmp.getLength()) {
			return true;
		}
		else return false;
	}
}

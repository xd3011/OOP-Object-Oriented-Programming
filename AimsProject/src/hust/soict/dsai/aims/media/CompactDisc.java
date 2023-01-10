package hust.soict.dsai.aims.media;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable {
	String artist;
	ArrayList<Track> tracks = new ArrayList<Track>();

	public CompactDisc() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	// Add Track
	public void addTrack(Track track) {
		for (Track t : tracks) {
			if (t.getTitle() == track.getTitle()) {
				System.out.println("The track already exists");
				return;
			}
		}
		System.out.println("The track has been added");
		tracks.add(track);
	}

	// Remove Track
	public void removeTrack(Track track) {
		boolean k = false;
		for (Track t : tracks) {
			if (t.getTitle() == track.getTitle()) {
				k = true;
				break;
			}
		}
		if (k) {
			System.out.println("The track has been removed");
			tracks.remove(track);
		} else {
			System.out.println("The track does not exist");
		}
	}

	public int getLength() {
		int total_length = 0;
		for (Track t : tracks) {
			total_length += t.getLength();
		}
		return total_length;
	}

	@Override
	public void play() throws PlayerException {
		int size = tracks.size();
		JPanel layout = new JPanel(new GridLayout(size, 1));
		if (this.getLength() < 0) {
			throw new PlayerException("ERROR : CD length is non-positive");
		}
		for (Track track : tracks) {
			if (track.getLength() > 0) {
				// create Label
				JLabel text = new JLabel("CD - Title : " + track.getTitle() + " Length : " + track.getLength());

				layout.add(text);
			} else
				throw new PlayerException("ERROR : Disc length is non-positive");
		}
		JDialog dialog = new JDialog();
		dialog.setSize(300, 200);
		dialog.add(layout);
		dialog.setTitle("Play CD");
		dialog.setVisible(true);
	}

	@Override
	public String toString() {
		return "CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - "
				+ this.getLength() + " : " + this.getCost() + " $ " + " Artist: " + this.getArtist() + " Tracks: "
				+ this.tracks;
	}
}

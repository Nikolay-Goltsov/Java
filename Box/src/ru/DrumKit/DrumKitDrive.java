/**
 * 
 */
package ru.DrumKit;

import ru.GameLauncher.Player;

/**
 * @author Hakers
 *
 */
class DrumKit {
	boolean topHat = true;
	boolean share = true;

	public void playShare() {
		// TODO Auto-generated method stub
		System.out.println("Bach Bach Ba-Bach");
	}

	public void playTopHat() {
		// TODO Auto-generated method stub
		System.out.println("Din Din Di-Din");
	}

}

public class DrumKitDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrumKit d = new DrumKit();
		d.playShare();
		d.playTopHat();
		d.share = false;
		if (d.share == true) {
			d.playShare();

		}

	}

}

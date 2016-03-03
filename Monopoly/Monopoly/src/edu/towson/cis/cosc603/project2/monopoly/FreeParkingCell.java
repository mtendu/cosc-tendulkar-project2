package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class FreeParkingCell.
 */
public class FreeParkingCell extends Cell {

	/**
	 * Instantiates a new free parking cell.
	 */
	public FreeParkingCell() {
		setName("Free Parking");
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction()
	 */
	public boolean playAction(String msg) {
		return false;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.Cell#playerMoved(edu.towson.cis.cosc603.project2.monopoly.Player, int, edu.towson.cis.cosc603.project2.monopoly.GameMaster)
	 */
	public void playerMoved(Player player, int playerIndex,
			GameMaster gameMaster) {
		if (this.isAvailable()) {
			int price = this.getPrice();
			if (price <= player.getMoney() && price > 0) {
				gameMaster.getGUI().enablePurchaseBtn(playerIndex);
			}
		}
		gameMaster.getGUI().enableEndTurnBtn(playerIndex);
	}
}

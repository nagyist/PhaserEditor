
// -- user code here --

/* --- start generated code --- */

// Generated by Phaser Editor v1.4.2 (Phaser v2.6.2)


class Menu extends Phaser.State {
	
	/**
	 * Menu.
	 */
	constructor() {
		
		super();
		
	}
	
	init() {
		
		this.stage.backgroundColor = '#8080ff';
		
	}
	
	preload () {
		
	}
	
	create() {
		// user code
		this.initObjects();
		
	}
	
	/* state-methods-begin */
	
	initObjects() {
		this.add.text(100, 100, "Click to play", { fill:"#000" });
	}

	update() {
		if (this.input.activePointer.isDown) {
			this.game.state.start("Level");
		}
	}
	
	/* state-methods-end */
	
}
/* --- end generated code --- */
// -- user code here --

// Generated by Phaser Editor v1.4.0 (Phaser v2.6.2)
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
/**
 * Menu.
 */
var Menu = (function (_super) {
    __extends(Menu, _super);
    function Menu() {
        return _super.call(this) || this;
    }
    Menu.prototype.init = function () {
    };
    Menu.prototype.preload = function () {
        this.load.pack('preloader', 'assets/pack.json');
    };
    ;
    Menu.prototype.create = function () {
        this.add.sprite(-172, -103, 'bg');
        this.add.sprite(285, 217, 'play');
        // user code
        this.initObjects();
    };
    /* state-methods-begin */
    Menu.prototype.initObjects = function () {
    };
    Menu.prototype.update = function () {
        if (this.input.activePointer.isDown) {
            this.game.state.start("Level");
        }
    };
    return Menu;
}(Phaser.State));
/* --- end generated code --- */
// -- user code here --

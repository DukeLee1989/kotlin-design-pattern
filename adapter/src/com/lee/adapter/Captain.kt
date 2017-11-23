package com.lee.adapter

class Captain : BattleShip {

    private var battleShip: BattleShip?

    constructor(battleShip: BattleShip?) {
        this.battleShip = battleShip
    }


    override fun fire() {
        battleShip?.fire();
    }

    override fun move() {
        battleShip?.move();
    }
}
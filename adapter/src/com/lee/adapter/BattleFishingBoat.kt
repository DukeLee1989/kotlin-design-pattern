package com.lee.adapter

class BattleFishingBoat : BattleShip {

    private val boat: FishingBoat?

    constructor() {
        boat = FishingBoat()
    }

    override fun fire() {
        println("fire!")
    }

    override fun move() {
        boat?.sail()
    }
}
package com.lee.builder

fun main(args: Array<String>) {

    val hero = Hero.Builder(Profession.MAGE,"").withArmor(Armor.CHAIN_MAIL).build()

    println(hero)


}
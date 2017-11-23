package com.lee.builder

enum class Armor private constructor(val d: String) {

    CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

    override fun toString(): String {
        return d
    }

}
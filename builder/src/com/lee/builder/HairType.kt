package com.lee.builder

enum class HairType private constructor(val d: String) {

    BALD("bald"), SHORT("short"), CURLY("curly"), LONG_STRAIGHT("long straight"), LONG_CURLY("long curly");

    override fun toString(): String {
        return d
    }
}
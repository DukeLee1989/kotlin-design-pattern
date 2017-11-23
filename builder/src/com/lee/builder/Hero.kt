package com.lee.builder

class Hero {

    var profession: Profession
    var name: String
    var hairType: HairType
    var hairColor: HairColor
    var armor: Armor
    var weapon: Weapon

    constructor(builder: Builder) {
        profession = builder.profession
        name = builder.name
        hairType = builder.hairType
        hairColor = builder.hairColor
        armor = builder.armor
        weapon = builder.weapon
    }

    override fun toString(): String {

        val stringBuilder = StringBuilder()
        stringBuilder.append("This is a")
                .append(profession)
                .append(" named ")
                .append(name)

        if (hairColor != null || hairType != null) {
            stringBuilder.append(" with ")

            if (hairColor != null) {
                stringBuilder.append(hairColor).append(' ')
            }
            if (hairType != null) {
                stringBuilder.append(hairType).append(' ')
            }
            //stringBuilder.append(hairType != HairType.BALD  "hair" : "head")
        }

        if (armor != null)
            stringBuilder.append(" wearing ").append(armor)

        if (weapon != null)
            stringBuilder.append(" and wielding a ").append(weapon)

        stringBuilder.append(".")

        return stringBuilder.toString()
    }


    class Builder {
        var profession: Profession
        var name: String
        var hairType = HairType.BALD
        var hairColor = HairColor.BLACK
        var armor = Armor.CHAIN_MAIL
        var weapon = Weapon.AXE

        constructor(profession: Profession, name: String) {
            if (profession == null || name == null) {
                throw IllegalArgumentException("profession and name can not be null")
            }
            this.profession = profession
            this.name = name

        }

        fun withHairType(hairType: HairType): Builder {
            this.hairType = hairType
            return this
        }

        fun withHairColr(hairColor: HairColor): Builder {
            this.hairColor = hairColor
            return this
        }

        fun withArmor(armor: Armor): Builder {
            this.armor = armor;
            return this
        }

        fun withWeapob(weapon: Weapon): Builder {
            this.weapon = weapon
            return this
        }

        fun build(): Hero {
            return Hero(this)
        }
    }


}
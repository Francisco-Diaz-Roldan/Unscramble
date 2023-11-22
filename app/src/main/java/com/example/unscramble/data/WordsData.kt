/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.unscramble.data

const val MAX_NO_OF_WORDS = 10
const val SCORE_INCREASE = 20

// Set with all the words for the Game
val allWords: Set<String> = setOf(
    "bulbasaur", "ivysaur", "venusaur", "charmander", "charmeleon", "charizard",
    "squirtle", "wartortle", "blastoise", "caterpie", "metapod", "butterfree",
    "weedle", "kakuna", "beedrill", "pidgey", "pidgeotto", "pidgeot", "rattata",
    "raticate", "spearow", "fearow", "ekans", "arbok", "pikachu", "raichu",
    "sandshrew", "sandslash", "nidoran", "nidorina", "nidoqueen", "nidoran♂",
    "nidorino", "nidoking", "clefairy", "clefable", "vulpix", "ninetales",
    "jigglypuff", "wigglytuff", "zubat", "golbat", "oddish", "gloom", "vileplume",
    "paras", "parasect", "venonat", "venomoth", "diglett", "dugtrio", "meowth",
    "persian", "psyduck", "golduck", "mankey", "primeape", "growlithe", "arcanine",
    "poliwag", "poliwhirl", "poliwrath", "abra", "kadabra", "alakazam", "machop",
    "machoke", "machamp", "bellsprout", "weepinbell", "victreebel", "tentacool",
    "tentacruel", "geodude", "graveler", "golem", "ponyta", "rapidash", "slowpoke",
    "slowbro", "magnemite", "magneton", "farfetch'd", "doduo", "dodrio", "seel",
    "dewgong", "grimer", "muk", "shellder", "cloyster", "gastly", "haunter",
    "gengar", "onix", "drowzee", "hypno", "krabby", "kingler", "voltorb", "electrode",
    "exeggcute", "exeggutor", "cubone", "marowak", "hitmonlee", "hitmonchan",
    "lickitung", "koffing", "weezing", "rhyhorn", "rhydon", "chansey", "tangela",
    "kangaskhan", "horsea", "seadra", "goldeen", "seaking", "staryu", "starmie",
    "mr. mime", "scyther", "jynx", "electabuzz", "magmar", "pinsir", "tauros",
    "magikarp", "gyarados", "lapras", "ditto", "eevee", "vaporeon", "jolteon",
    "flareon", "porygon", "omanyte", "omastar", "kabuto", "kabutops", "aerodactyl",
    "snorlax", "articuno", "zapdos", "moltres", "dratini", "dragonair", "dragonite",
    "mewtwo", "mew", "chikorita", "bayleef", "meganium", "cyndaquil", "quilava",
    "typhlosion", "totodile", "croconaw", "feraligatr", "sentret", "furret",
    "hoothoot", "noctowl", "ledyba", "ledian", "spinarak", "ariados", "crobat",
    "chinchou", "lanturn", "pichu", "cleffa", "igglybuff", "togepi", "togetic",
    "natu", "xatu", "mareep", "flaaffy", "ampharos", "bellossom", "marill", "azumarill",
    "sudowoodo", "politoed", "hoppip", "skiploom", "jumpluff", "aipom", "sunkern",
    "sunflora", "yanma", "wooper", "quagsire", "espeon", "umbreon", "murkrow",
    "slowking", "misdreavous", "unown", "wobbuffet", "girafarig", "pineco",
    "forretress", "dunsparce", "gligar", "steelix", "snubbull", "granbull", "qwilfish",
    "scizor", "shuckle", "heracross", "sneasel", "teddiursa", "ursaring", "slugma",
    "magcargo", "swinub", "piloswine", "corsola", "remoraid", "octillery", "delibird",
    "mantine", "skarmory", "houndour", "houndoom", "kingdra", "phanpy", "donphan",
    "porygon2", "stantler", "smeargle", "tyrogue", "hitmontop", "smoochum",
    "elekid", "magby", "miltank", "blissey", "raikou", "entei", "suicune", "larvitar",
    "pupitar", "tyranitar", "lugia", "ho-oh", "celebi", /*"treecko", "grovyle", "sceptile",
    "torchic", "combusken", "blaziken","mudkip", "marshtomp", "swampert", "poochyena",
    "mightyena", "zigzagoon", "linoone", "wurmple", "silcoon", "beautifly", "cascoon",
    "dustox", "lotad", "lombre", "ludicolo", "seedot", "nuzleaf", "shiftry", "taillow",
    "swellow", "wingull", "pelipper", "ralts", "kirlia", "gardevoir", "surskit", "masquerain",
    "shroomish", "breloom", "slakoth", "vigoroth", "slaking", "nincada", "ninjask",
    "shedinja", "whismur", "loudred", "exploud", "makuhita", "hariyama", "azurill",
    "nosepass", "skitty", "delcatty", "sableye", "mawile", "aron", "lairon",
    "aggron", "meditite", "medicham", "electrike", "manectric", "plusle", "minun",
    "volbeat", "illumise", "roselia", "gulpin", "swalot", "carvanha", "sharpedo",
    "wailmer", "wailord", "numel", "camerupt", "torkoal", "spoink", "grumpig",
    "spinda", "trapinch", "vibrava", "flygon", "cacnea", "cacturne", "swablu",
    "altaria", "zangoose", "seviper", "lunatone", "solrock", "barboach", "whiscash",
    "corphish", "crawdaunt", "baltoy", "claydol", "lileep", "cradily", "anorith",
    "armaldo", "feebas", "milotic", "castform", "kecleon", "shuppet", "banette",
    "duskull", "dusclops", "tropius", "chimecho", "absol", "wynaut", "snorunt",
    "glalie", "spheal", "sealeo", "walrein", "clamperl", "huntail", "gorebyss",
    "relicanth", "luvdisc", "bagon", "shelgon", "salamence", "beldum", "metang",
    "metagross", "regirock", "regice", "registeel", "latias", "latios", "kyogre",
    "groudon", "rayquaza", "jirachi", "deoxys"*/
)
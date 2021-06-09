package uk.co.dtd.pokedex

object PokedexMockResponse {
    operator fun invoke(): String =
        "{\n" +
                "  \"count\": 1118,\n" +
                "  \"next\": \"https://pokeapi.co/api/v2/pokemon?offset=10&limit=10\",\n" +
                "  \"previous\": null,\n" +
                "  \"results\": [\n" +
                "    {\n" +
                "      \"name\": \"bulbasaur\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/1/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"ivysaur\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/2/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"venusaur\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/3/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"charmander\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/4/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"charmeleon\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/5/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"charizard\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/6/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"squirtle\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/7/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"wartortle\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/8/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"blastoise\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/9/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"caterpie\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/10/\"\n" +
                "    }\n" +
                "  ]\n" +
                "}"
}

object PokemonDetailsMockResponse {
    operator fun invoke(): String =
        "{\n" +
                "  \"abilities\": [\n" +
                "    {\n" +
                "      \"ability\": {\n" +
                "        \"name\": \"overgrow\",\n" +
                "        \"url\": \"https://pokeapi.co/api/v2/ability/65/\"\n" +
                "      },\n" +
                "      \"is_hidden\": false,\n" +
                "      \"slot\": 1\n" +
                "    },\n" +
                "    {\n" +
                "      \"ability\": {\n" +
                "        \"name\": \"chlorophyll\",\n" +
                "        \"url\": \"https://pokeapi.co/api/v2/ability/34/\"\n" +
                "      },\n" +
                "      \"is_hidden\": true,\n" +
                "      \"slot\": 3\n" +
                "    }\n" +
                "  ],\n" +
                "  \"base_experience\": 64,\n" +
                "  \"forms\": [\n" +
                "    {\n" +
                "      \"name\": \"bulbasaur\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon-form/1/\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"height\": 7,\n" +
                "  \"held_items\": [],\n" +
                "  \"id\": 1,\n" +
                "  \"is_default\": true,\n" +
                "  \"location_area_encounters\": \"https://pokeapi.co/api/v2/pokemon/1/encounters\",\n" +
                "  \"moves\": [\n" +
                "    {\n" +
                "      \"move\": {\n" +
                "        \"name\": \"razor-wind\",\n" +
                "        \"url\": \"https://pokeapi.co/api/v2/move/13/\"\n" +
                "      },\n" +
                "      \"version_group_details\": [\n" +
                "        {\n" +
                "          \"level_learned_at\": 0,\n" +
                "          \"move_learn_method\": {\n" +
                "            \"name\": \"egg\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/move-learn-method/2/\"\n" +
                "          },\n" +
                "          \"version_group\": {\n" +
                "            \"name\": \"gold-silver\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/version-group/3/\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"level_learned_at\": 0,\n" +
                "          \"move_learn_method\": {\n" +
                "            \"name\": \"egg\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/move-learn-method/2/\"\n" +
                "          },\n" +
                "          \"version_group\": {\n" +
                "            \"name\": \"crystal\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/version-group/4/\"\n" +
                "          }\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"name\": \"bulbasaur\",\n" +
                "  \"order\": 1,\n" +
                "  \"past_types\": [],\n" +
                "  \"species\": {\n" +
                "    \"name\": \"bulbasaur\",\n" +
                "    \"url\": \"https://pokeapi.co/api/v2/pokemon-species/1/\"\n" +
                "  },\n" +
                "  \"sprites\": {\n" +
                "    \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/1.png\",\n" +
                "    \"back_female\": null,\n" +
                "    \"back_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/1.png\",\n" +
                "    \"back_shiny_female\": null,\n" +
                "    \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png\",\n" +
                "    \"front_female\": null,\n" +
                "    \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/1.png\",\n" +
                "    \"front_shiny_female\": null,\n" +
                "    \"other\": {\n" +
                "      \"dream_world\": {\n" +
                "        \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/1.svg\",\n" +
                "        \"front_female\": null\n" +
                "      },\n" +
                "      \"official-artwork\": {\n" +
                "        \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"versions\": {\n" +
                "      \"generation-i\": {\n" +
                "        \"red-blue\": {\n" +
                "          \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-i/red-blue/back/1.png\",\n" +
                "          \"back_gray\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-i/red-blue/back/gray/1.png\",\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-i/red-blue/1.png\",\n" +
                "          \"front_gray\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-i/red-blue/gray/1.png\"\n" +
                "        },\n" +
                "        \"yellow\": {\n" +
                "          \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-i/yellow/back/1.png\",\n" +
                "          \"back_gray\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-i/yellow/back/gray/1.png\",\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-i/yellow/1.png\",\n" +
                "          \"front_gray\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-i/yellow/gray/1.png\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"generation-ii\": {\n" +
                "        \"crystal\": {\n" +
                "          \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/crystal/back/1.png\",\n" +
                "          \"back_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/crystal/back/shiny/1.png\",\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/crystal/1.png\",\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/crystal/shiny/1.png\"\n" +
                "        },\n" +
                "        \"gold\": {\n" +
                "          \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/gold/back/1.png\",\n" +
                "          \"back_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/gold/back/shiny/1.png\",\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/gold/1.png\",\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/gold/shiny/1.png\"\n" +
                "        },\n" +
                "        \"silver\": {\n" +
                "          \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/silver/back/1.png\",\n" +
                "          \"back_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/silver/back/shiny/1.png\",\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/silver/1.png\",\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-ii/silver/shiny/1.png\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"generation-iii\": {\n" +
                "        \"emerald\": {\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iii/emerald/1.png\",\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iii/emerald/shiny/1.png\"\n" +
                "        },\n" +
                "        \"firered-leafgreen\": {\n" +
                "          \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iii/firered-leafgreen/back/1.png\",\n" +
                "          \"back_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iii/firered-leafgreen/back/shiny/1.png\",\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iii/firered-leafgreen/1.png\",\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iii/firered-leafgreen/shiny/1.png\"\n" +
                "        },\n" +
                "        \"ruby-sapphire\": {\n" +
                "          \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iii/ruby-sapphire/back/1.png\",\n" +
                "          \"back_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iii/ruby-sapphire/back/shiny/1.png\",\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iii/ruby-sapphire/1.png\",\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iii/ruby-sapphire/shiny/1.png\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"generation-iv\": {\n" +
                "        \"diamond-pearl\": {\n" +
                "          \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/diamond-pearl/back/1.png\",\n" +
                "          \"back_female\": null,\n" +
                "          \"back_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/diamond-pearl/back/shiny/1.png\",\n" +
                "          \"back_shiny_female\": null,\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/diamond-pearl/1.png\",\n" +
                "          \"front_female\": null,\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/diamond-pearl/shiny/1.png\",\n" +
                "          \"front_shiny_female\": null\n" +
                "        },\n" +
                "        \"heartgold-soulsilver\": {\n" +
                "          \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/heartgold-soulsilver/back/1.png\",\n" +
                "          \"back_female\": null,\n" +
                "          \"back_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/heartgold-soulsilver/back/shiny/1.png\",\n" +
                "          \"back_shiny_female\": null,\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/heartgold-soulsilver/1.png\",\n" +
                "          \"front_female\": null,\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/heartgold-soulsilver/shiny/1.png\",\n" +
                "          \"front_shiny_female\": null\n" +
                "        },\n" +
                "        \"platinum\": {\n" +
                "          \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/platinum/back/1.png\",\n" +
                "          \"back_female\": null,\n" +
                "          \"back_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/platinum/back/shiny/1.png\",\n" +
                "          \"back_shiny_female\": null,\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/platinum/1.png\",\n" +
                "          \"front_female\": null,\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-iv/platinum/shiny/1.png\",\n" +
                "          \"front_shiny_female\": null\n" +
                "        }\n" +
                "      },\n" +
                "      \"generation-v\": {\n" +
                "        \"black-white\": {\n" +
                "          \"animated\": {\n" +
                "            \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/back/1.gif\",\n" +
                "            \"back_female\": null,\n" +
                "            \"back_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/back/shiny/1.gif\",\n" +
                "            \"back_shiny_female\": null,\n" +
                "            \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/1.gif\",\n" +
                "            \"front_female\": null,\n" +
                "            \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/shiny/1.gif\",\n" +
                "            \"front_shiny_female\": null\n" +
                "          },\n" +
                "          \"back_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/back/1.png\",\n" +
                "          \"back_female\": null,\n" +
                "          \"back_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/back/shiny/1.png\",\n" +
                "          \"back_shiny_female\": null,\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/1.png\",\n" +
                "          \"front_female\": null,\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/shiny/1.png\",\n" +
                "          \"front_shiny_female\": null\n" +
                "        }\n" +
                "      },\n" +
                "      \"generation-vi\": {\n" +
                "        \"omegaruby-alphasapphire\": {\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-vi/omegaruby-alphasapphire/1.png\",\n" +
                "          \"front_female\": null,\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-vi/omegaruby-alphasapphire/shiny/1.png\",\n" +
                "          \"front_shiny_female\": null\n" +
                "        },\n" +
                "        \"x-y\": {\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-vi/x-y/1.png\",\n" +
                "          \"front_female\": null,\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-vi/x-y/shiny/1.png\",\n" +
                "          \"front_shiny_female\": null\n" +
                "        }\n" +
                "      },\n" +
                "      \"generation-vii\": {\n" +
                "        \"icons\": {\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-vii/icons/1.png\",\n" +
                "          \"front_female\": null\n" +
                "        },\n" +
                "        \"ultra-sun-ultra-moon\": {\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-vii/ultra-sun-ultra-moon/1.png\",\n" +
                "          \"front_female\": null,\n" +
                "          \"front_shiny\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-vii/ultra-sun-ultra-moon/shiny/1.png\",\n" +
                "          \"front_shiny_female\": null\n" +
                "        }\n" +
                "      },\n" +
                "      \"generation-viii\": {\n" +
                "        \"icons\": {\n" +
                "          \"front_default\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-viii/icons/1.png\",\n" +
                "          \"front_female\": null\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"stats\": [\n" +
                "    {\n" +
                "      \"base_stat\": 45,\n" +
                "      \"effort\": 0,\n" +
                "      \"stat\": {\n" +
                "        \"name\": \"hp\",\n" +
                "        \"url\": \"https://pokeapi.co/api/v2/stat/1/\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"base_stat\": 49,\n" +
                "      \"effort\": 0,\n" +
                "      \"stat\": {\n" +
                "        \"name\": \"attack\",\n" +
                "        \"url\": \"https://pokeapi.co/api/v2/stat/2/\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"base_stat\": 49,\n" +
                "      \"effort\": 0,\n" +
                "      \"stat\": {\n" +
                "        \"name\": \"defense\",\n" +
                "        \"url\": \"https://pokeapi.co/api/v2/stat/3/\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"base_stat\": 65,\n" +
                "      \"effort\": 1,\n" +
                "      \"stat\": {\n" +
                "        \"name\": \"special-attack\",\n" +
                "        \"url\": \"https://pokeapi.co/api/v2/stat/4/\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"base_stat\": 65,\n" +
                "      \"effort\": 0,\n" +
                "      \"stat\": {\n" +
                "        \"name\": \"special-defense\",\n" +
                "        \"url\": \"https://pokeapi.co/api/v2/stat/5/\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"base_stat\": 45,\n" +
                "      \"effort\": 0,\n" +
                "      \"stat\": {\n" +
                "        \"name\": \"speed\",\n" +
                "        \"url\": \"https://pokeapi.co/api/v2/stat/6/\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"types\": [\n" +
                "    {\n" +
                "      \"slot\": 1,\n" +
                "      \"type\": {\n" +
                "        \"name\": \"grass\",\n" +
                "        \"url\": \"https://pokeapi.co/api/v2/type/12/\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"slot\": 2,\n" +
                "      \"type\": {\n" +
                "        \"name\": \"poison\",\n" +
                "        \"url\": \"https://pokeapi.co/api/v2/type/4/\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"weight\": 69\n" +
                "}"
}
package com.database;

import java.util.ArrayList;
import java.util.List;

import com.entities.Pokemon;
import com.entities.Tipo;

public class database {
        // Model Pokemon

        private List<Pokemon> pokemons;
        private List<Tipo> tipos;

        public database() {
                this.pokemons = new ArrayList<>();
                this.tipos = new ArrayList<>();
        }

        public void inicialize() {
                seederTipos();
                seederPokemons();

        }

        @Override
        public String toString() {
                String listaPokemons = listPokemonsByNome();
                return "Pokemons na base de dados : [\n" + listaPokemons + "]";
        }

        // seeders
        private void seederPokemons() {
                // Linha Bulbasaur
                pokemons.add(new Pokemon(3, "Venusaur", montaListTiposByIndices(1, 2), null, 0, false));
                pokemons.add(new Pokemon(2, "Ivysaur", montaListTiposByIndices(1, 2), buscaPokemonByNome("Venusaur"),
                                32, false));
                Pokemon i = buscaPokemonByNome("Ivysaur");

                pokemons.add(new Pokemon(1, "Bulbasaur", montaListTiposByIndices(1, 2), i,
                                16,
                                false));
                System.out.println(this.buscaPokemonByNome("Bulbasaur").getNumero());
                // Linha Charmander
                pokemons.add(new Pokemon(6, "Charizard", montaListTiposByIndices(7, 18),
                                null, 0, false));

                pokemons.add(new Pokemon(5, "Charmeleon", montaListTiposByIndices(7),
                                buscaPokemonByNome("Charizard"), 36, false));

                pokemons.add(new Pokemon(4, "Charmander", montaListTiposByIndices(7),
                                buscaPokemonByNome("Charmeleon"), 16, false));

                // Linha Squirtle
                pokemons.add(new Pokemon(9, "Blastoise", montaListTiposByIndices(2),
                                null, 0, false));

                pokemons.add(new Pokemon(8, "Wartortle", montaListTiposByIndices(2),
                                buscaPokemonByNome("Blastoise"), 36, false));

                pokemons.add(new Pokemon(7, "Squirtle", montaListTiposByIndices(2),
                                buscaPokemonByNome("Wartortle"), 16, false));

                // Linha Caterpie
                pokemons.add(new Pokemon(12, "Butterfree", montaListTiposByIndices(9, 18),
                                null, 0, false));

                pokemons.add(new Pokemon(11, "Metapod", montaListTiposByIndices(9),
                                buscaPokemonByNome("Butterfree"), 10, false));

                pokemons.add(new Pokemon(10, "Caterpie", montaListTiposByIndices(9), buscaPokemonByNome("Metapod"), 7,
                                false));

                // Linha Weedle
                pokemons.add(new Pokemon(15, "Beedrill", montaListTiposByIndices(9, 17),
                                null, 0, false));

                pokemons.add(new Pokemon(14, "Kakuna", montaListTiposByIndices(9, 17),
                                buscaPokemonByNome("Beedrill"), 10, false));

                pokemons.add(new Pokemon(13, "Weedle", montaListTiposByIndices(9, 17),
                                buscaPokemonByNome("Kakuna"), 7, false));

                // Linha Pidgey
                pokemons.add(new Pokemon(18, "Pidgeot", montaListTiposByIndices(11, 18),
                                null, 0, false));

                pokemons.add(new Pokemon(17, "Pidgeotto", montaListTiposByIndices(11, 18),
                                buscaPokemonByNome("Pidgeot"), 36, false));

                pokemons.add(new Pokemon(16, "Pidgey", montaListTiposByIndices(11, 18),
                                buscaPokemonByNome("Pidgeotto"), 18, false));

                // Linha Rattata
                pokemons.add(new Pokemon(20, "Raticate", montaListTiposByIndices(11),
                                null, 0, false));

                pokemons.add(new Pokemon(19, "Rattata", montaListTiposByIndices(11),
                                buscaPokemonByNome("Raticate"), 20, false));

                // Linha Spearow
                pokemons.add(new Pokemon(22, "Fearow", montaListTiposByIndices(11, 18),
                                null, 0, false));

                pokemons.add(new Pokemon(21, "Spearow", montaListTiposByIndices(11, 18),
                                buscaPokemonByNome("Fearow"), 20, false));

                // Linha Ekans
                pokemons.add(new Pokemon(24, "Arbok", montaListTiposByIndices(17),
                                null, 0, false));

                pokemons.add(new Pokemon(23, "Ekans", montaListTiposByIndices(17),
                                buscaPokemonByNome("Arbok"), 22, false));

                // Linha Pikachu
                pokemons.add(new Pokemon(26, "Raichu", montaListTiposByIndices(4),
                                null, 0, false));

                pokemons.add(new Pokemon(25, "Pikachu", montaListTiposByIndices(4),
                                buscaPokemonByNome("Raichu"), 0, false)); // Evolui com Thunder Stone

                // Linha Sandshrew
                pokemons.add(new Pokemon(28, "Sandslash", montaListTiposByIndices(16),
                                null, 0, false));

                pokemons.add(new Pokemon(27, "Sandshrew", montaListTiposByIndices(16),
                                buscaPokemonByNome("Sandslash"), 22, false));

                // Linha Nidoran♀
                pokemons.add(new Pokemon(31, "Nidoqueen", montaListTiposByIndices(17, 16),
                                null, 0, false));

                pokemons.add(new Pokemon(30, "Nidorina", montaListTiposByIndices(17),
                                buscaPokemonByNome("Nidoqueen"), 0, false)); // Evolui com Moon Stone

                pokemons.add(new Pokemon(29, "Nidoran♀", montaListTiposByIndices(17),
                                buscaPokemonByNome("Nidorina"), 16, false));

                // Linha Nidoran♂
                pokemons.add(new Pokemon(34, "Nidoking", montaListTiposByIndices(17, 16),
                                null, 0, false));

                pokemons.add(new Pokemon(33, "Nidorino", montaListTiposByIndices(17),
                                buscaPokemonByNome("Nidoking"), 0, false)); // Evolui com Moon Stone

                pokemons.add(new Pokemon(32, "Nidoran♂", montaListTiposByIndices(17),
                                buscaPokemonByNome("Nidorino"), 16, false));

                // Linha Clefairy
                pokemons.add(new Pokemon(36, "Clefable", montaListTiposByIndices(5),
                                null, 0, false));

                pokemons.add(new Pokemon(35, "Clefairy", montaListTiposByIndices(5),
                                buscaPokemonByNome("Clefable"), 0, false)); // Evolui com Moon Stone

                // Linha Vulpix
                pokemons.add(new Pokemon(38, "Ninetales", montaListTiposByIndices(7),
                                null, 0, false));

                pokemons.add(new Pokemon(37, "Vulpix", montaListTiposByIndices(7),
                                buscaPokemonByNome("Ninetales"), 0, false)); // Evolui com Fire Stone

                // Linha Jigglypuff
                pokemons.add(new Pokemon(40, "Wigglytuff", montaListTiposByIndices(11, 5),
                                null, 0, false));

                pokemons.add(new Pokemon(39, "Jigglypuff", montaListTiposByIndices(11, 5),
                                buscaPokemonByNome("Wigglytuff"), 0, false)); // Evolui com Moon Stone

                // Linha Zubat
                pokemons.add(new Pokemon(42, "Golbat", montaListTiposByIndices(17, 18),
                                null, 0, false));

                pokemons.add(new Pokemon(41, "Zubat", montaListTiposByIndices(17, 18),
                                buscaPokemonByNome("Golbat"), 22, false));
                // Linha Oddish
                pokemons.add(new Pokemon(45, "Vileplume", montaListTiposByIndices(13, 17),
                                null, 0, false));

                pokemons.add(new Pokemon(44, "Gloom", montaListTiposByIndices(13, 17),
                                buscaPokemonByNome("Vileplume"), 0, false)); // Evolui com Leaf Stone

                pokemons.add(new Pokemon(43, "Oddish", montaListTiposByIndices(13, 17),
                                buscaPokemonByNome("Gloom"), 21, false));

                // Linha Paras
                pokemons.add(new Pokemon(47, "Parasect", montaListTiposByIndices(9, 13),
                                null, 0, false));

                pokemons.add(new Pokemon(46, "Paras", montaListTiposByIndices(9, 13),
                                buscaPokemonByNome("Parasect"), 24, false));

                // Linha Venonat
                pokemons.add(new Pokemon(49, "Venomoth", montaListTiposByIndices(9, 17),
                                null, 0, false));

                pokemons.add(new Pokemon(48, "Venonat", montaListTiposByIndices(9, 17),
                                buscaPokemonByNome("Venomoth"), 31, false));

                // Linha Diglett
                pokemons.add(new Pokemon(51, "Dugtrio", montaListTiposByIndices(16),
                                null, 0, false));

                pokemons.add(new Pokemon(50, "Diglett", montaListTiposByIndices(16),
                                buscaPokemonByNome("Dugtrio"), 26, false));

                // Linha Meowth
                pokemons.add(new Pokemon(53, "Persian", montaListTiposByIndices(11),
                                null, 0, false));

                pokemons.add(new Pokemon(52, "Meowth", montaListTiposByIndices(11),
                                buscaPokemonByNome("Persian"), 28, false));

                // Linha Psyduck
                pokemons.add(new Pokemon(55, "Golduck", montaListTiposByIndices(2),
                                null, 0, false));

                pokemons.add(new Pokemon(54, "Psyduck", montaListTiposByIndices(2),
                                buscaPokemonByNome("Golduck"), 33, false));

                // Linha Mankey
                pokemons.add(new Pokemon(57, "Primeape", montaListTiposByIndices(10),
                                null, 0, false));

                pokemons.add(new Pokemon(56, "Mankey", montaListTiposByIndices(10),
                                buscaPokemonByNome("Primeape"), 28, false));

                // Linha Growlithe
                pokemons.add(new Pokemon(59, "Arcanine", montaListTiposByIndices(7),
                                null, 0, false));

                pokemons.add(new Pokemon(58, "Growlithe", montaListTiposByIndices(7),
                                buscaPokemonByNome("Arcanine"), 0, false)); // Evolui com Fire Stone

                // Linha Poliwag
                pokemons.add(new Pokemon(62, "Poliwrath", montaListTiposByIndices(2, 10),
                                null, 0, false));

                pokemons.add(new Pokemon(61, "Poliwhirl", montaListTiposByIndices(2),
                                buscaPokemonByNome("Poliwrath"), 0, false)); // Evolui com Water Stone

                pokemons.add(new Pokemon(60, "Poliwag", montaListTiposByIndices(2),
                                buscaPokemonByNome("Poliwhirl"), 25, false));

                // Linha Abra
                pokemons.add(new Pokemon(65, "Alakazam", montaListTiposByIndices(14),
                                null, 0, false));

                pokemons.add(new Pokemon(64, "Kadabra", montaListTiposByIndices(14),
                                buscaPokemonByNome("Alakazam"), 0, false)); // Evolui por troca

                pokemons.add(new Pokemon(63, "Abra", montaListTiposByIndices(14),
                                buscaPokemonByNome("Kadabra"), 16, false));

                // Linha Machop
                pokemons.add(new Pokemon(68, "Machamp", montaListTiposByIndices(10),
                                null, 0, false));

                pokemons.add(new Pokemon(67, "Machoke", montaListTiposByIndices(10),
                                buscaPokemonByNome("Machamp"), 0, false)); // Evolui por troca

                pokemons.add(new Pokemon(66, "Machop", montaListTiposByIndices(10),
                                buscaPokemonByNome("Machoke"), 28, false));

                // Linha Bellsprout
                pokemons.add(new Pokemon(71, "Victreebel", montaListTiposByIndices(13, 17),
                                null, 0, false));

                pokemons.add(new Pokemon(70, "Weepinbell", montaListTiposByIndices(13, 17),
                                buscaPokemonByNome("Victreebel"), 0, false)); // Evolui com Leaf Stone

                pokemons.add(new Pokemon(69, "Bellsprout", montaListTiposByIndices(13, 17),
                                buscaPokemonByNome("Weepinbell"), 21, false));

                // Linha Tentacool
                pokemons.add(new Pokemon(73, "Tentacruel", montaListTiposByIndices(2, 17),
                                null, 0, false));

                pokemons.add(new Pokemon(72, "Tentacool", montaListTiposByIndices(2, 17),
                                buscaPokemonByNome("Tentacruel"), 30, false));

                // Linha Geodude
                pokemons.add(new Pokemon(76, "Golem", montaListTiposByIndices(12, 16),
                                null, 0, false));

                pokemons.add(new Pokemon(75, "Graveler", montaListTiposByIndices(12, 16),
                                buscaPokemonByNome("Golem"), 0, false)); // Evolui por troca

                pokemons.add(new Pokemon(74, "Geodude", montaListTiposByIndices(12, 16),
                                buscaPokemonByNome("Graveler"), 25, false));

                // Linha Ponyta
                pokemons.add(new Pokemon(78, "Rapidash", montaListTiposByIndices(7),
                                null, 0, false));

                pokemons.add(new Pokemon(77, "Ponyta", montaListTiposByIndices(7),
                                buscaPokemonByNome("Rapidash"), 40, false));

                // Linha Slowpoke
                pokemons.add(new Pokemon(80, "Slowbro", montaListTiposByIndices(2, 14),
                                null, 0, false));

                pokemons.add(new Pokemon(79, "Slowpoke", montaListTiposByIndices(2, 14),
                                buscaPokemonByNome("Slowbro"), 37, false));

                // Linha Magnemite
                pokemons.add(new Pokemon(82, "Magneton", montaListTiposByIndices(4, 1),
                                null, 0, false));

                pokemons.add(new Pokemon(81, "Magnemite", montaListTiposByIndices(4, 1),
                                buscaPokemonByNome("Magneton"), 30, false));

                // Farfetch'd (sem evolução)
                pokemons.add(new Pokemon(83, "Farfetch'd", montaListTiposByIndices(11, 18),
                                null, 0, false));

                // Linha Doduo
                pokemons.add(new Pokemon(85, "Dodrio", montaListTiposByIndices(11, 18),
                                null, 0, false));

                pokemons.add(new Pokemon(84, "Doduo", montaListTiposByIndices(11, 18),
                                buscaPokemonByNome("Dodrio"), 31, false));

                // Linha Seel
                pokemons.add(new Pokemon(87, "Dewgong", montaListTiposByIndices(2, 6),
                                null, 0, false));

                pokemons.add(new Pokemon(86, "Seel", montaListTiposByIndices(2),
                                buscaPokemonByNome("Dewgong"), 34, false));

                // Linha Grimer
                pokemons.add(new Pokemon(89, "Muk", montaListTiposByIndices(17),
                                null, 0, false));

                pokemons.add(new Pokemon(88, "Grimer", montaListTiposByIndices(17),
                                buscaPokemonByNome("Muk"), 38, false));

                // Linha Shellder
                pokemons.add(new Pokemon(91, "Cloyster", montaListTiposByIndices(2, 6),
                                null, 0, false));

                pokemons.add(new Pokemon(90, "Shellder", montaListTiposByIndices(2),
                                buscaPokemonByNome("Cloyster"), 0, false)); // Evolui com Water Stone

                // Linha Gastly
                pokemons.add(new Pokemon(94, "Gengar", montaListTiposByIndices(6, 17),
                                null, 0, false));

                pokemons.add(new Pokemon(93, "Haunter", montaListTiposByIndices(6, 17),
                                buscaPokemonByNome("Gengar"), 0, false)); // Evolui por troca

                pokemons.add(new Pokemon(92, "Gastly", montaListTiposByIndices(6, 17),
                                buscaPokemonByNome("Haunter"), 25, false));

                // Onix (sem evolução)
                pokemons.add(new Pokemon(95, "Onix", montaListTiposByIndices(12, 16),
                                null, 0, false));

                // Linha Drowzee
                pokemons.add(new Pokemon(97, "Hypno", montaListTiposByIndices(14),
                                null, 0, false));

                pokemons.add(new Pokemon(96, "Drowzee", montaListTiposByIndices(14),
                                buscaPokemonByNome("Hypno"), 26, false));

                // Linha Krabby
                pokemons.add(new Pokemon(99, "Kingler", montaListTiposByIndices(2),
                                null, 0, false));

                pokemons.add(new Pokemon(98, "Krabby", montaListTiposByIndices(2),
                                buscaPokemonByNome("Kingler"), 28, false));

                // Linha Voltorb
                pokemons.add(new Pokemon(101, "Electrode", montaListTiposByIndices(4),
                                null, 0, false));

                pokemons.add(new Pokemon(100, "Voltorb", montaListTiposByIndices(4),
                                buscaPokemonByNome("Electrode"), 30, false));

                // Linha Exeggcute
                pokemons.add(new Pokemon(103, "Exeggutor", montaListTiposByIndices(13, 14),
                                null, 0, false));

                pokemons.add(new Pokemon(102, "Exeggcute", montaListTiposByIndices(13, 14),
                                buscaPokemonByNome("Exeggutor"), 0, false)); // Evolui com Leaf Stone

                // Linha Cubone
                pokemons.add(new Pokemon(105, "Marowak", montaListTiposByIndices(16),
                                null, 0, false));

                pokemons.add(new Pokemon(104, "Cubone", montaListTiposByIndices(16),
                                buscaPokemonByNome("Marowak"), 28, false));

                // Hitmonlee (sem evolução)
                pokemons.add(new Pokemon(106, "Hitmonlee", montaListTiposByIndices(10),
                                null, 0, false));

                // Hitmonchan (sem evolução)
                pokemons.add(new Pokemon(107, "Hitmonchan", montaListTiposByIndices(10),
                                null, 0, false));

                // Lickitung (sem evolução)
                pokemons.add(new Pokemon(108, "Lickitung", montaListTiposByIndices(11),
                                null, 0, false));

                // Linha Koffing
                pokemons.add(new Pokemon(110, "Weezing", montaListTiposByIndices(17),
                                null, 0, false));

                pokemons.add(new Pokemon(109, "Koffing", montaListTiposByIndices(17),
                                buscaPokemonByNome("Weezing"), 35, false));

                // Linha Rhyhorn
                pokemons.add(new Pokemon(112, "Rhydon", montaListTiposByIndices(16, 12),
                                null, 0, false));

                pokemons.add(new Pokemon(111, "Rhyhorn", montaListTiposByIndices(16, 12),
                                buscaPokemonByNome("Rhydon"), 42, false));

                // Chansey (sem evolução)
                pokemons.add(new Pokemon(113, "Chansey", montaListTiposByIndices(11),
                                null, 0, false));

                // Tangela (sem evolução)
                pokemons.add(new Pokemon(114, "Tangela", montaListTiposByIndices(13),
                                null, 0, false));

                // Kangaskhan (sem evolução)
                pokemons.add(new Pokemon(115, "Kangaskhan", montaListTiposByIndices(11),
                                null, 0, false));

                // Linha Horsea
                pokemons.add(new Pokemon(117, "Seadra", montaListTiposByIndices(2),
                                null, 0, false));

                pokemons.add(new Pokemon(116, "Horsea", montaListTiposByIndices(2),
                                buscaPokemonByNome("Seadra"), 32, false));

                // Linha Goldeen
                pokemons.add(new Pokemon(119, "Seaking", montaListTiposByIndices(2),
                                null, 0, false));

                pokemons.add(new Pokemon(118, "Goldeen", montaListTiposByIndices(2),
                                buscaPokemonByNome("Seaking"), 33, false));

                // Linha Staryu
                pokemons.add(new Pokemon(121, "Starmie", montaListTiposByIndices(2, 14),
                                null, 0, false));

                pokemons.add(new Pokemon(120, "Staryu", montaListTiposByIndices(2),
                                buscaPokemonByNome("Starmie"), 0, false)); // Evolui com Water Stone

                // Mr. Mime (sem evolução)
                pokemons.add(new Pokemon(122, "Mr. Mime", montaListTiposByIndices(14, 5),
                                null, 0, false));

                // Scyther (sem evolução)
                pokemons.add(new Pokemon(123, "Scyther", montaListTiposByIndices(9, 18),
                                null, 0, false));
                // Jynx (sem evolução)
                pokemons.add(new Pokemon(124, "Jynx", montaListTiposByIndices(6, 14),
                                null, 0, false));

                // Electabuzz (sem evolução)
                pokemons.add(new Pokemon(125, "Electabuzz", montaListTiposByIndices(4),
                                null, 0, false));

                // Magmar (sem evolução)
                pokemons.add(new Pokemon(126, "Magmar", montaListTiposByIndices(7),
                                null, 0, false));

                // Pinsir (sem evolução)
                pokemons.add(new Pokemon(127, "Pinsir", montaListTiposByIndices(9),
                                null, 0, false));

                // Tauros (sem evolução)
                pokemons.add(new Pokemon(128, "Tauros", montaListTiposByIndices(11),
                                null, 0, false));

                // Linha Magikarp
                pokemons.add(new Pokemon(130, "Gyarados", montaListTiposByIndices(2, 18),
                                null, 0, false));

                pokemons.add(new Pokemon(129, "Magikarp", montaListTiposByIndices(2),
                                buscaPokemonByNome("Gyarados"), 20, false));

                // Lapras (sem evolução)
                pokemons.add(new Pokemon(131, "Lapras", montaListTiposByIndices(2, 6),
                                null, 0, false));

                // Ditto (sem evolução)
                pokemons.add(new Pokemon(132, "Ditto", montaListTiposByIndices(11),
                                null, 0, false));
                // Linha Eevee
                pokemons.add(new Pokemon(134, "Vaporeon", montaListTiposByIndices(2), null, 0, false));
                pokemons.add(new Pokemon(135, "Jolteon", montaListTiposByIndices(4), null, 0, false));
                pokemons.add(new Pokemon(136, "Flareon", montaListTiposByIndices(7), null, 0, false));

                pokemons.add(new Pokemon(133, "Eevee", montaListTiposByIndices(11), buscaPokemonByNome("Vaporeon"), 0,
                                false)); // Evolui com Water Stone
                pokemons.add(new Pokemon(133, "Eevee", montaListTiposByIndices(11), buscaPokemonByNome("Jolteon"), 0,
                                false)); // Evolui com Thunder Stone
                pokemons.add(new Pokemon(133, "Eevee", montaListTiposByIndices(11), buscaPokemonByNome("Flareon"), 0,
                                false)); // Evolui com Fire Stone

                // Porygon (sem evolução)
                pokemons.add(new Pokemon(137, "Porygon", montaListTiposByIndices(11), null, 0, false));

                // Linha Omanyte
                pokemons.add(new Pokemon(139, "Omastar", montaListTiposByIndices(12, 2), null, 0, false));
                pokemons.add(new Pokemon(138, "Omanyte", montaListTiposByIndices(12, 2), buscaPokemonByNome("Omastar"),
                                40, false));

                // Linha Kabuto
                pokemons.add(new Pokemon(141, "Kabutops", montaListTiposByIndices(12, 2), null, 0, false));
                pokemons.add(new Pokemon(140, "Kabuto", montaListTiposByIndices(12, 2), buscaPokemonByNome("Kabutops"),
                                40, false));

                // Aerodactyl (sem evolução)
                pokemons.add(new Pokemon(142, "Aerodactyl", montaListTiposByIndices(12, 18), null, 0, false));

                // Snorlax (sem evolução)
                pokemons.add(new Pokemon(143, "Snorlax", montaListTiposByIndices(11), null, 0, false));

                // Articuno (lendário, sem evolução)
                pokemons.add(new Pokemon(144, "Articuno", montaListTiposByIndices(6, 18), null, 0, true));

                // Zapdos (lendário, sem evolução)
                pokemons.add(new Pokemon(145, "Zapdos", montaListTiposByIndices(4, 18), null, 0, true));

                // Moltres (lendário, sem evolução)
                pokemons.add(new Pokemon(146, "Moltres", montaListTiposByIndices(7, 18), null, 0, true));

                // Linha Dratini
                pokemons.add(new Pokemon(149, "Dragonite", montaListTiposByIndices(3, 18), null, 0, false));
                pokemons.add(new Pokemon(148, "Dragonair", montaListTiposByIndices(3), buscaPokemonByNome("Dragonite"),
                                55, false));
                pokemons.add(new Pokemon(147, "Dratini", montaListTiposByIndices(3), buscaPokemonByNome("Dragonair"),
                                30, false));

                // Mewtwo (lendário, sem evolução)
                pokemons.add(new Pokemon(150, "Mewtwo", montaListTiposByIndices(14), null, 0, true));

                // Mew (lendário, sem evolução)
                pokemons.add(new Pokemon(151, "Mew", montaListTiposByIndices(14), null, 0, true));

        }

        private void seederTipos() {
                this.addTipos();
                this.addAtributosEmTipos();

        }

        // subFunctionsSeederTipos
        private void addTipos() {
                this.tipos.add(new Tipo(1, "aço"));
                this.tipos.add(new Tipo(2, "água"));
                this.tipos.add(new Tipo(3, "Dragão"));
                this.tipos.add(new Tipo(4, "Elétrico"));
                this.tipos.add(new Tipo(5, "Fada"));
                this.tipos.add(new Tipo(6, "Fantasma"));
                this.tipos.add(new Tipo(7, "Fogo"));
                this.tipos.add(new Tipo(8, "Felo"));
                this.tipos.add(new Tipo(9, "Inseto"));
                this.tipos.add(new Tipo(10, "Lutador"));
                this.tipos.add(new Tipo(11, "Normal"));
                this.tipos.add(new Tipo(12, "Pedra"));
                this.tipos.add(new Tipo(13, "Planta"));
                this.tipos.add(new Tipo(14, "Psíquico"));
                this.tipos.add(new Tipo(15, "Sombrio"));
                this.tipos.add(new Tipo(16, "Terrestre"));
                this.tipos.add(new Tipo(17, "Venenoso"));
                this.tipos.add(new Tipo(18, "Voador"));

        }

        private void addAtributosEmTipos() {

                // 1 - Aço
                buscaTipoByIndice(1).setFraquezas(montaListTiposByIndices(2, 4, 7));
                buscaTipoByIndice(1).setResistencias(montaListTiposByIndices(1, 6, 8, 9, 12, 13, 17));

                // 2 - Água
                buscaTipoByIndice(2).setFraquezas(montaListTiposByIndices(7, 13, 16));
                buscaTipoByIndice(2).setResistencias(montaListTiposByIndices(2, 4, 7, 13));

                // 3 - Dragão
                buscaTipoByIndice(3).setFraquezas(montaListTiposByIndices(3, 5, 8));
                buscaTipoByIndice(3).setResistencias(montaListTiposByIndices(2, 3, 4, 7, 8, 13));

                // 4 - Elétrico
                buscaTipoByIndice(4).setFraquezas(montaListTiposByIndices(8, 16));
                buscaTipoByIndice(4).setResistencias(montaListTiposByIndices(4, 2, 13, 17));

                // 5 - Fada
                buscaTipoByIndice(5).setFraquezas(montaListTiposByIndices(1, 7, 17));
                buscaTipoByIndice(5).setResistencias(montaListTiposByIndices(5, 6, 7, 13, 14));

                // 6 - Fantasma
                buscaTipoByIndice(6).setFraquezas(montaListTiposByIndices(6, 14, 15));
                buscaTipoByIndice(6).setResistencias(montaListTiposByIndices(2, 6, 13, 17));

                // 7 - Fogo
                buscaTipoByIndice(7).setFraquezas(montaListTiposByIndices(2, 8, 12, 16));
                buscaTipoByIndice(7).setResistencias(montaListTiposByIndices(7, 1, 4, 6, 9, 13, 17));

                // 8 - Gelo
                buscaTipoByIndice(8).setFraquezas(montaListTiposByIndices(1, 7, 10, 12));
                buscaTipoByIndice(8).setResistencias(montaListTiposByIndices(8));

                // 9 - Inseto
                buscaTipoByIndice(9).setFraquezas(montaListTiposByIndices(7, 8, 10, 12));
                buscaTipoByIndice(9).setResistencias(montaListTiposByIndices(9, 13, 17));

                // 10 - Lutador
                buscaTipoByIndice(10).setFraquezas(montaListTiposByIndices(6, 13, 14, 15));
                buscaTipoByIndice(10).setResistencias(montaListTiposByIndices(10, 12, 16));

                // 11 - Normal
                buscaTipoByIndice(11).setFraquezas(montaListTiposByIndices(10));
                buscaTipoByIndice(11).setResistencias(montaListTiposByIndices(0)); // Nenhuma resistência

                // 12 - Pedra
                buscaTipoByIndice(12).setFraquezas(montaListTiposByIndices(2, 10, 13, 16, 17));
                buscaTipoByIndice(12).setResistencias(montaListTiposByIndices(1, 7, 8, 9));

                // 13 - Planta
                buscaTipoByIndice(13).setFraquezas(montaListTiposByIndices(7, 8, 9, 12, 17));
                buscaTipoByIndice(13).setResistencias(montaListTiposByIndices(2, 4, 13));

                // 14 - Psíquico
                buscaTipoByIndice(14).setFraquezas(montaListTiposByIndices(9, 14, 15));
                buscaTipoByIndice(14).setResistencias(montaListTiposByIndices(10, 14));

                // 15 - Sombrio
                buscaTipoByIndice(15).setFraquezas(montaListTiposByIndices(10, 17, 5));
                buscaTipoByIndice(15).setResistencias(montaListTiposByIndices(6, 15));

                // 16 - Terrestre
                buscaTipoByIndice(16).setFraquezas(montaListTiposByIndices(2, 9, 13));
                buscaTipoByIndice(16).setResistencias(montaListTiposByIndices(4, 12, 16, 17));

                // 17 - Venenoso
                buscaTipoByIndice(17).setFraquezas(montaListTiposByIndices(12, 16));
                buscaTipoByIndice(17).setResistencias(montaListTiposByIndices(5, 9, 10, 13, 17));

                // 18 - Voador
                buscaTipoByIndice(18).setFraquezas(montaListTiposByIndices(4, 8, 12));
                buscaTipoByIndice(18).setResistencias(montaListTiposByIndices(7, 9, 13, 10, 16));
        }

        // helperSeeder
        private List<Tipo> montaListTiposByIndices(int... indices) {
                List<Tipo> listaTipos = new ArrayList<>();
                for (int indice : indices) {
                        listaTipos.add(buscaTipoByIndice(indice));
                }
                return listaTipos;

        }

        // helperPublics
        public Tipo buscaTipoByIndice(int indiceTipo) {
                for (Tipo t : tipos) {
                        if (t.getIndice() == indiceTipo)
                                return t;
                }
                return null;
        }

        public Tipo buscaTipoByNome(String nome) {
                for (Tipo t : tipos) {
                        if (t.getNome().equals(nome)) {
                                return t;
                        }
                }
                return null;
        }

        public String listPokemonsByNome() {

                String listaPokemons = "";
                for (Pokemon pokemon : pokemons) {
                        listaPokemons = listaPokemons + pokemon.getNome() + "\n";
                }
                return listaPokemons;

        }

        public Pokemon buscaPokemonById(int id) {
                for (Pokemon p : pokemons) {
                        if (p.getNumero() == id) {
                                return p;
                        }
                }
                return null;
        }

        public Pokemon buscaPokemonByNome(String nome) {
                for (Pokemon pokemon : pokemons) {
                        if (pokemon.getNome().equals(nome)) {
                                return pokemon;
                        }
                }
                return null;
        }
}

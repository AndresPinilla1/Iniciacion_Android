package com.example.iniciacion_android.Utilidades;

import com.example.iniciacion_android.R;
import java.util.ArrayList;

public class Utilidades {
    // Atributos
    private static ArrayList<Jugador> listaJugadores = new ArrayList<>();

    public static ArrayList<Jugador> getData() {
        // Si la lista está vacía, la inicializamos con sus datos
        if (listaJugadores.isEmpty()) {
            listaJugadores.add(new Jugador("Rafa Nadal",
                    "Edad: 37 años\nGrand Slams: 22\nMasters 1000: 36\nTotal Títulos: 92\nPaís: España\n",
                    "Rafael Nadal Parera, nacido el 3 de junio de 1986 en Manacor, Mallorca, es ampliamente considerado como uno de los mejores tenistas en la historia del deporte. Conocido como el 'Rey de la Tierra Batida', Nadal ha establecido un dominio sin precedentes en esta superficie, logrando 14 títulos de Roland Garros, un récord absoluto que muchos expertos consideran prácticamente inalcanzable. Su estilo de juego se caracteriza por su potencia, resistencia y capacidad para mantener la intensidad física y mental durante largos partidos. Una de las cualidades más admiradas de Nadal es su espíritu de lucha; nunca da un punto por perdido y su capacidad para remontar en situaciones adversas se ha convertido en una de sus marcas personales.\n\n" +
                            "Desde que irrumpió en el circuito en 2005, ganando su primer Roland Garros con tan solo 19 años, Nadal ha demostrado ser un competidor formidable en todas las superficies, aunque su dominio en arcilla es legendario. En césped, ganó Wimbledon en dos ocasiones, incluyendo una final épica en 2008 contra Roger Federer, considerada por muchos como el mejor partido en la historia del tenis. En pistas duras, ha conquistado múltiples títulos, incluidos dos US Open y un Abierto de Australia, lo que demuestra su versatilidad.\n\n" +
                            "Más allá de sus logros individuales, Nadal ha sido una pieza clave en el éxito del equipo español de Copa Davis, contribuyendo a múltiples victorias para su país. Su rivalidad con Roger Federer y Novak Djokovic ha definido una era dorada del tenis, ofreciendo a los aficionados algunos de los partidos más emocionantes y memorables de todos los tiempos. A diferencia de sus rivales, Nadal destaca por su humildad y actitud respetuosa dentro y fuera de la pista, lo que le ha ganado el respeto no solo de sus compañeros, sino también de millones de fanáticos alrededor del mundo.\n\n" +
                            "Fuera del tenis, Nadal es conocido por su dedicación a causas benéficas a través de la Fundación Rafa Nadal, que trabaja para brindar oportunidades educativas y deportivas a niños desfavorecidos. También es un ávido golfista y apasionado por el deporte en general. Su influencia trasciende el tenis, y es considerado un modelo a seguir por su ética de trabajo, humildad y determinación. A pesar de haber enfrentado numerosas lesiones a lo largo de su carrera, Nadal siempre ha regresado con más fuerza, consolidándose como una leyenda viviente del tenis y un verdadero embajador del deporte.",
                    R.drawable.rafa));

            listaJugadores.add(new Jugador("Alexander Zverev",
                    "Edad: 26 años\nGrand Slams: 0\nMasters 1000: 5\nTotal Títulos: 23\nPaís: Alemania\n",
                    "Alexander 'Sascha' Zverev, nacido el 20 de abril de 1997 en Hamburgo, Alemania, es uno de los jugadores más destacados de la nueva generación. Con una imponente altura de 1,98 metros, Zverev es conocido por su saque explosivo y su juego agresivo desde el fondo de la pista. Su ascenso meteórico lo llevó a convertirse en el jugador más joven en entrar al Top 10 del ranking ATP desde Novak Djokovic.\n\n" +
                            "Aunque todavía busca su primer Grand Slam, Zverev ha logrado importantes victorias, incluyendo el ATP Finals de 2018 y múltiples Masters 1000. Su capacidad para adaptarse a diferentes superficies, combinada con su resistencia mental y física, lo convierten en un rival formidable. Zverev ha alcanzado finales de Grand Slam, como el US Open 2020, donde estuvo muy cerca de su primer gran título.\n\n" +
                            "Más allá de sus logros deportivos, Zverev es admirado por su compromiso con su familia y su país. Representa a Alemania en la Copa Davis y ha sido una figura clave en la popularidad del tenis en su nación. Fuera de la pista, Zverev se dedica a iniciativas benéficas y está trabajando para fortalecer su consistencia mental y física para convertirse en campeón de Grand Slam.",
                    R.drawable.zverev));

            listaJugadores.add(new Jugador("Carlos Alcaraz",
                    "Edad: 20 años\nGrand Slams: 4\nMasters 1000: 5\nTotal Títulos: 17\nPaís: España\n",
                    "Carlos Alcaraz, nacido el 5 de mayo de 2003 en El Palmar, Murcia, es la nueva cara del tenis español y una de las mayores promesas del deporte. Con apenas 20 años, Alcaraz ha logrado lo que muchos solo sueñan: ganar Grand Slams y establecerse como uno de los mejores jugadores del mundo. Su estilo de juego completo y explosivo combina golpes potentes con una capacidad impresionante para adaptarse a cualquier situación táctica.\n\n" +
                            "Alcaraz ha sido comparado con Rafael Nadal debido a su determinación y éxito a temprana edad, pero su juego único lo diferencia. Es capaz de ejecutar golpes de magia desde ángulos imposibles, y su energía en la pista lo hace emocionante de ver. En 2022, ganó su primer título de Grand Slam en el US Open, convirtiéndose en el número 1 del mundo más joven de la historia.\n\n" +
                            "Fuera de la pista, Alcaraz es conocido por su humildad y su pasión por el deporte. Entrena bajo la guía del exjugador Juan Carlos Ferrero, quien ha sido una influencia clave en su desarrollo. Con su enfoque, habilidades y juventud, Alcaraz está destinado a marcar una era en el tenis y convertirse en un ícono global.",
                    R.drawable.carlos_alcaraz));

            listaJugadores.add(new Jugador("Danil Medvedev",
                    "Edad: 28 años\nGrand Slams: 1\nMasters 1000: 6\nTotal Títulos: 20\nPaís: Rusia\n",
                    "Danil Medvedev, nacido el 11 de febrero de 1996 en Moscú, Rusia, es conocido por su estilo de juego único y su impresionante consistencia en las pistas. Medvedev es un maestro de la defensa, con la capacidad de convertir la defensa en ataque gracias a su movimiento fluido y golpes planos inusuales que confunden a sus oponentes. Su victoria en el US Open 2021, donde derrotó a Novak Djokovic en sets corridos, fue un momento definitorio en su carrera.\n\n" +
                            "A lo largo de los años, Medvedev se ha ganado una reputación por su enfoque táctico y su habilidad para leer el juego de sus rivales. Su paciencia y fortaleza mental le han permitido alcanzar el número 1 del mundo en el ranking ATP, consolidándose como uno de los jugadores más consistentes de su generación. También ha sido una figura clave en la Copa Davis, liderando al equipo ruso a la victoria en 2021.\n\n" +
                            "Fuera de la pista, Medvedev es conocido por su humor irónico y su honestidad en entrevistas, lo que lo convierte en una personalidad intrigante dentro del mundo del tenis. Está casado con Daria, quien ha sido una gran fuente de apoyo en su carrera. Con su enfoque analítico y su resistencia física, Medvedev sigue siendo una fuerza formidable en el circuito y un contendiente constante en los grandes torneos.",
                    R.drawable.danil_medveded));

            listaJugadores.add(new Jugador("Jannik Sinner",
                    "Edad: 22 años\nGrand Slams: 0\nMasters 1000: 1\nTotal Títulos: 8\nPaís: Italia\n",
                    "Jannik Sinner, nacido el 16 de agosto de 2001 en San Candido, Italia, es uno de los talentos más prometedores del tenis actual. A pesar de su corta edad, ya se ha consolidado como un jugador temido en el circuito por su potencia desde el fondo de la pista y su precisión quirúrgica en los golpes. Su capacidad para generar ángulos imposibles y mantenerse calmado bajo presión lo distingue entre la nueva generación de tenistas.\n\n" +
                            "Sinner comenzó su carrera deportiva como esquiador, pero su amor por el tenis lo llevó a dedicarse por completo a este deporte. Su meteórico ascenso en el ranking ATP es un reflejo de su dedicación y disciplina. Con un juego que combina agresividad con una excelente técnica, Sinner se ha convertido en un habitual en las rondas finales de los torneos más importantes del mundo.\n\n" +
                            "Fuera de la pista, Sinner es conocido por su humildad y su pasión por mejorar constantemente. Bajo la tutela de su entrenador Riccardo Piatti, continúa desarrollándose como jugador. Con su juventud, talento y determinación, Sinner está destinado a ser una fuerza dominante en el tenis durante los próximos años.",
                    R.drawable.jannik_sinner));

            listaJugadores.add(new Jugador("Casper Ruud",
                    "Edad: 24 años\nGrand Slams: 0\nMasters 1000: 0\nTotal Títulos: 12\nPaís: Noruega\n",
                    "Casper Ruud, nacido el 22 de diciembre de 1998 en Oslo, Noruega, es conocido como uno de los especialistas más destacados en tierra batida del circuito ATP. Su estilo de juego combina precisión y consistencia, permitiéndole alcanzar múltiples finales importantes, incluyendo dos finales de Grand Slam en 2022. Aunque todavía no ha ganado un Major, Ruud ha demostrado ser un competidor formidable.\n\n" +
                            "Hijo del exjugador Christian Ruud, Casper creció rodeado por el tenis y se inspiró en las grandes leyendas del deporte para perfeccionar su estilo. Su capacidad para mantenerse firme durante largos intercambios y su técnica impecable lo convierten en un rival difícil de vencer, especialmente en superficies lentas.\n\n" +
                            "Además de su enfoque en la pista, Ruud es conocido por su carácter tranquilo y su amor por el golf, que practica como pasatiempo. Ha elevado el perfil del tenis noruego a nivel internacional y es visto como una figura clave para el desarrollo del deporte en su país natal. Con su ética de trabajo y determinación, es solo cuestión de tiempo antes de que Ruud consiga su primer título de Grand Slam.",
                    R.drawable.casper_ruud));

            listaJugadores.add(new Jugador("Grigor Dimitrov",
                    "Edad: 32 años\nGrand Slams: 0\nMasters 1000: 1\nTotal Títulos: 8\nPaís: Bulgaria\n",
                    "Grigor Dimitrov, nacido el 16 de mayo de 1991 en Haskovo, Bulgaria, es conocido cariñosamente como 'Baby Federer' debido a la similitud de su elegante estilo de juego con el del legendario Roger Federer. Dimitrov es un jugador versátil que combina un revés a una mano exquisito con un saque efectivo y una excelente movilidad en la pista.\n\n" +
                            "Dimitrov alcanzó su punto culminante en 2017 cuando ganó el ATP Finals, consolidándose como uno de los mejores jugadores del mundo ese año. Aunque todavía no ha conseguido un título de Grand Slam, su talento y potencial son innegables. Ha sido una constante amenaza en los grandes torneos, llegando a las semifinales en múltiples ocasiones y ganándose el respeto de sus compañeros y fanáticos.\n\n" +
                            "Fuera de la pista, Dimitrov es conocido por su carisma y su involucramiento en causas benéficas. Habla varios idiomas y es admirado por su compromiso con promover el tenis en Bulgaria, inspirando a jóvenes tenistas en su país. Con su experiencia y habilidades, Dimitrov sigue siendo un contendiente peligroso en cualquier torneo.",
                    R.drawable.grigor_dimitrov));

            listaJugadores.add(new Jugador("Stefanos Tsitsipas",
                    "Edad: 25 años\nGrand Slams: 0\nMasters 1000: 2\nTotal Títulos: 10\nPaís: Grecia\n",
                    "Stefanos Tsitsipas, nacido el 12 de agosto de 1998 en Atenas, Grecia, es uno de los jugadores más talentosos y creativos del circuito actual. Con su revés a una mano excepcional y su enfoque táctico, Tsitsipas ha demostrado ser un jugador versátil capaz de competir al más alto nivel en todas las superficies.\n\n" +
                            "Tsitsipas ha alcanzado finales importantes, incluyendo el Roland Garros 2021, donde mostró su habilidad para competir con los mejores. Su juego agresivo y su capacidad para dictar el ritmo de los puntos lo convierten en un oponente peligroso. Además, su carisma y su actitud apasionada en la pista han ganado muchos admiradores.\n\n" +
                            "Más allá del tenis, Tsitsipas es conocido por su amor por la fotografía y la filosofía, intereses que comparte regularmente en sus redes sociales. Es un embajador del tenis griego y una figura clave para la popularidad del deporte en su país. Con su juventud y talento, Tsitsipas está en camino de dejar una huella duradera en el tenis.",
                    R.drawable.stefanos_tsitsipas));

            listaJugadores.add(new Jugador("Novak Djokovic",
                    "Edad: 37 años\nGrand Slams: 24\nMasters 1000: 40\nTotal Títulos: 99\nPaís: Serbia\n",
                    "Novak Djokovic, nacido el 22 de mayo de 1987 en Belgrado, Serbia, es considerado uno de los mejores jugadores en la historia del tenis. Con 24 títulos de Grand Slam, Djokovic ha establecido nuevos estándares de excelencia en el deporte. Su capacidad para adaptarse a todas las superficies, su resistencia física y mental, y su enfoque táctico lo han convertido en el jugador más completo del circuito.\n\n" +
                            "Djokovic es conocido por su juego de devolución, que es considerado el mejor de la historia, así como por su capacidad para rendir bajo presión. Sus enfrentamientos con Rafael Nadal y Roger Federer han dado lugar a una de las rivalidades más intensas y emocionantes del tenis, definiendo una era dorada para el deporte.\n\n" +
                            "Además de sus logros en la pista, Djokovic es un filántropo activo y defensor de los derechos de los jugadores en el circuito. A través de la Fundación Novak Djokovic, apoya la educación infantil en Serbia y otros países. Fuera del tenis, es un apasionado del yoga, la meditación y la vida saludable. Su impacto en el deporte es incuestionable, y su legado como uno de los más grandes continuará inspirando a generaciones futuras.",
                    R.drawable.novak_djokovic));

            listaJugadores.add(new Jugador("Roger Federer",
                    "Edad: 42 años\nGrand Slams: 20\nMasters 1000: 28\nTotal Títulos: 103\nPaís: Suiza\n",
                    "Roger Federer, nacido el 8 de agosto de 1981 en Basilea, Suiza, es ampliamente considerado como el jugador más elegante y técnicamente dotado en la historia del tenis. Su revés a una mano, su saque y volea, y su habilidad para adaptarse a cualquier superficie lo han hecho destacar durante más de dos décadas. Con 20 títulos de Grand Slam y 103 títulos en total, Federer es un símbolo de consistencia y excelencia.\n\n" +
                            "Desde sus primeros años, Federer mostró un talento excepcional, pero fue su enfoque disciplinado y su pasión por el deporte lo que lo llevó al estrellato. Ganó su primer Grand Slam en Wimbledon 2003 y continuó dominando el circuito durante años, alcanzando un récord de 310 semanas como número 1 del mundo.\n\n" +
                            "Más allá de su éxito en la pista, Federer es admirado por su comportamiento impecable y su carisma. Su legado trasciende el tenis: a través de la Fundación Roger Federer, apoya proyectos educativos en África y otras regiones desfavorecidas. Su impacto en el tenis y su popularidad entre los fanáticos son incomparables, asegurando su lugar como una leyenda del deporte.",
                    R.drawable.roger_federer));

            listaJugadores.add(new Jugador("Holger Rune",
                    "Edad: 20 años\nGrand Slams: 0\nMasters 1000: 1\nTotal Títulos: 4\nPaís: Dinamarca\n",
                    "Holger Rune, nacido el 29 de abril de 2003 en Copenhague, Dinamarca, es una de las jóvenes promesas más emocionantes del tenis mundial. Con un estilo de juego agresivo y una personalidad vibrante, Rune se ha convertido rápidamente en una figura destacada en el circuito ATP. Su capacidad para adaptarse y su confianza en sí mismo lo hacen destacar entre sus contemporáneos.\n\n" +
                            "Rune ha demostrado su valía al ganar su primer Masters 1000 en París, derrotando a varios de los mejores jugadores del mundo en el camino. Su determinación y ética de trabajo son innegables, y muchos lo consideran uno de los futuros campeones de Grand Slam.\n\n" +
                            "Fuera de la pista, Rune es conocido por su pasión por el deporte y su actitud competitiva. Aunque su carácter a veces genera controversia, no cabe duda de que aporta una energía única al circuito. Con su juventud y ambición, Holger Rune es un nombre que seguirá resonando en los próximos años.",
                    R.drawable.holger_rune));

            listaJugadores.add(new Jugador("Taylor Fritz",
                    "Edad: 26 años\nGrand Slams: 0\nMasters 1000: 1\nTotal Títulos: 8\nPaís: Estados Unidos\n",
                    "Taylor Fritz, nacido el 28 de octubre de 1997 en Rancho Santa Fe, California, es considerado el líder de la nueva generación de tenistas estadounidenses. Con un saque poderoso y golpes contundentes desde el fondo de la pista, Fritz se ha establecido como una fuerza a tener en cuenta en el circuito ATP. Su victoria en el Masters 1000 de Indian Wells 2022 marcó un hito importante en su carrera.\n\n" +
                            "Fritz ha sido consistente en su progreso, representando a Estados Unidos en la Copa Davis y en otras competiciones internacionales. Su estilo de juego, que combina potencia y precisión, le permite competir con los mejores del mundo en cualquier superficie.\n\n" +
                            "Fuera de la pista, Fritz es un ávido jugador de videojuegos y un apasionado de los deportes. Es padre de un hijo y equilibra su vida familiar con su carrera profesional. Como uno de los principales tenistas estadounidenses, Fritz tiene el potencial de inspirar a una nueva generación de jugadores en su país.",
                    R.drawable.taylor_fritz));
        }
        return listaJugadores;
    }

    public static void eliminarJugador(int position) {
        if (position >= 0 && position < listaJugadores.size()) {
            listaJugadores.remove(position);
        }
    }
}

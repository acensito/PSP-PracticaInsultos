package servidor;

import java.util.Random;

public class Frases {
    private static final String[] INSULTOS = {
        "Eres más feo que un frigorífico por detrás.",
        "Eres más inútil que un paraguas en el desierto.",
        "Eres más lento que un caracol con reuma.",
        "Tienes menos luces que un chupete.",
        "Eres más falso que un billete de tres euros.",
        "Tienes menos credibilidad que un horóscopo.",
        "Eres más pesado que un elefante en un trampolín.",
        "Tienes menos neuronas que un choco.",
        "Eres más desagradable que un chicle en el pelo.",
        "Eres más basto que un bocadillo de escombros.",
        "Eres tan feo que tu madre te ponía collares de chorizo para que los perros jugasen contigo."
    };

    private static final String[] PIROPOS = {
        "La disciplina tarde o temprano vencerá a la inteligencia.",
        "Haz de cada día tu obra maestra.",
        "Las oportunidades no ocurren, tú las creas.",
        "No dejes que el miedo te frene, cada error es una lección.",
        "Todo gran logro comienza con la decisión de intentarlo.",
        "El momento en que quieres dejarlo es justo el momento en que tienes que seguir avanzando."
    };

    private static final Random RANDOM = new Random();

    public static String getInsulto() {
        return INSULTOS[RANDOM.nextInt(INSULTOS.length)];
    }

    public static String getPiropo() {
        return PIROPOS[RANDOM.nextInt(PIROPOS.length)];
    }
}

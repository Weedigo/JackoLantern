public class Runner {
    public static void main(String[] args){
        String[][] face = new String[6][8];
        JackOLantern face1 = new JackOLantern(face);

        face1.fill("X");
        face1.edit("\\", 0, 0);
        face1.edit(" ", 0, 1);
        face1.edit(" ", 0, 2);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 4);
        face1.edit(" ", 0, 5);
        face1.edit(" ", 0, 6);
        face1.edit("/", 0, 7);

        face1.edit(" ", 1, 0);
        face1.edit(" ", 5, 7);
        face1.edit(" ", 1, 7);
        face1.edit(" ", 5, 0);
        face1.edit("0", 2, 2);
        face1.edit("0", 2, 5);
        face1.edit("^", 3, 3);
        face1.edit("^", 3, 4);
        face1.edit("|", 4, 1);
        face1.edit("|", 4, 2);
        face1.edit("_", 4, 3);
        face1.edit("_", 4, 4);
        face1.edit("|", 4, 5);
        face1.edit("|", 4, 6);
        System.out.println(face1);
    }
}

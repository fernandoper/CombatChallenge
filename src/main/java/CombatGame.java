import entities.Champion;
import java.util.Locale;
import java.util.Scanner;

public class CombatGame {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String nameA = sc.nextLine();

        System.out.print("Vida inicial: ");
        int lifeA = sc.nextInt();

        System.out.print("Ataque: ");
        int attackA = sc.nextInt();

        System.out.print("Armadura: ");
        int armorA = sc.nextInt();
        sc.nextLine();

        System.out.println();
        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        String nameB = sc.nextLine();

        System.out.print("Vida inicial: ");
        int lifeB = sc.nextInt();

        System.out.print("Ataque: ");
        int attackB = sc.nextInt();

        System.out.print("Armadura: ");
        int armorB = sc.nextInt();

        Champion championA = new Champion(nameA, lifeA, attackA, armorA);
        Champion championB = new Champion(nameB, lifeB, attackB, armorB);

        System.out.println();
        System.out.print("Quantos turnos voce deseja executar? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.println("Resultado do turno " + i + ":");

            championA.takeDamage(championB.getAttack());
            championB.takeDamage(championA.getAttack());

            System.out.println(championA.status());
            System.out.println(championB.status());

            if (championA.getLife() == 0 || championB.getLife() == 0) {
                System.out.println();
                break;
            }
            System.out.println();
        }

        System.out.println("FIM DO COMBATE");

        sc.close();
    }
}

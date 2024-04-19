import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private boolean isGraveyardDestroyed = false;

    public void destroyGraveyard() {
        isGraveyardDestroyed = true;
        // Дополнительные действия по уничтожению кладбища и освобождению ресурсов
        System.out.println("Вы разрушили кладбище, эти души свободны, они вас никогда не забудут.");
    }

    public void printGraveyardHistory() {
        if (!isGraveyardDestroyed) {
            // Логика вывода истории кладбища
            System.out.println("История кладбища: старое кладбище, построенное в 1967 году в Мухосранске. Здесь похоронены люди, " +
                    "которые не смогли сбежать из этого города, и теперь их души навсегда покоются здесь.");
            // Вывод известных похороненных, событий и легенд
        } else {
            System.out.println("Кладбище было уничтожено. Теперь здесь ничего нет.");
        }
    }
    public static void displayEmployees(String[][] employees) {
        System.out.println("Люди на кладбище:");
        for (String[] employee : employees) {
            System.out.println("Имя: " + employee[0] + ", Должность: " + employee[1]);
        }
    }

    private static String[][] graves = {
            {"Иван Иванов", "01.01.1950", "Здесь покоится Иван Иванов."},
            {"Петр Петров", "15.05.1975", "Вечная память Петру Петрову."},
            {"Анна Сидорова", "10.11.1988", "Покойся с миром, Анна."}
    };

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String[][] employees = {
                {"Володя", "Охранник"},
                {"Петька", "Гробовщик"},
                {"Миха", "Мёртвый анархист"}
        };
        int choice = 0;

        while (choice != 5) {
            System.out.println("Меню:");
            System.out.println("1. Кто есть на кладбище");
            System.out.println("2. Уничтожить кладбище");
            System.out.println("3. История кладбища");
            System.out.println("4. Посетить кладбище");
            System.out.println("5. Добавить могилу на кладбище");
            System.out.println("6. Обновить информацию о могиле");
            System.out.println("7. История могил");
            System.out.println("8. Выход");
            System.out.println("9. ...здесь");
            System.out.println("10. ...Я");

            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    main.displayEmployees(employees);
                    break;
                case 2:
                    main.destroyGraveyard();
                    break;
                case 3:
                    main.printGraveyardHistory();
                    break;
                case 4:
                    // Для вызова нестатической функции visitGraveyard() необходимо создать объект класса Main
                    Main graveVisitor = new Main();
                    graveVisitor.visitGraveyard();
                    break;
                case 5:
                    // Для вызова нестатической функции addGraveToGraveyard() необходимо создать объект класса Main
                    Main graveAdder = new Main();
                    graveAdder.addGraveToGraveyard();
                    break;
                case 6:
                    // Для вызова нестатической функции updateGraveDetails() необходимо создать объект класса Main
                    Main graveUpdater = new Main();
                    graveUpdater.updateGraveDetails();
                    break;
                case 7:
                    main.GraveyardInfo(main.graves);
                    break;
                case 8:
                    System.out.println ("Все ворота кладбища заколочены. Никто не покинет это место. Я ОСТАНУСЬ ЗДЕСЬ НАВСЕГДА!"); break;
                case 9:
                    main.additionalActionsOnDestroy();
                    break;
                case 10:
                    main.additionalActionsOnVisitGraveyard();
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите еще раз.");
                    break;
            }
        }
        scanner.close();
    }

    public void visitGraveyard() {
        if (!isGraveyardDestroyed) {
            // Логика посещения кладбища
            System.out.println("Я на территории кладбища. Тут пахнет гнилью и свежей мертвечиной");
            // Возможно вывод специального сообщения или проведение тура
        } else {
            System.out.println("Кладбище разрушено. Посещение невозможно.");
        }
    }

    public void addGraveToGraveyard() {
        if (!isGraveyardDestroyed) {
            // Логика добавления могилы на кладбище
            System.out.println("Добавление новой могилы на кладбище...");

            // Запрос пользователю информации о могиле: имя похороненного, дата смерти, описание и т.д.
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ФИО похороненного: ");
            String name = scanner.nextLine();
            System.out.print("Введите дату смерти: ");
            String date = scanner.nextLine();
            System.out.print("Введите описание могилы: ");
            String description = scanner.nextLine();

            // Дополнительная логика добавления могилы в базу данных или массив
            System.out.println("Могила успешно добавлена: " + name + ", " + date + ", " + description);
        } else {
            System.out.println("Кладбище разрушено. Добавление могилы невозможно.");
        }
    }

    public void updateGraveDetails() {
        if (!isGraveyardDestroyed) {
            // Логика обновления информации о могиле на кладбище
            System.out.println("Обновление информации о могиле на кладбище...");

            // Запрос пользователю информации для обновления: имя похороненного, дата смерти, описание и т.д.
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ФИО похороненного, данные о котором вы хотите обновить: ");
            String name = scanner.nextLine();

            // Предположим, что мы хотим обновить только описание могилы
            System.out.print("Введите новое описание могилы: ");
            String newDescription = scanner.nextLine();

            // Дополнительная логика обновления информации о могиле в базе данных или массиве
            System.out.println("Информация о могиле успешно обновлена: " + name + ", Новое описание: " + newDescription);
        } else {
            System.out.println("Кладбище разрушено. Обновление информации о могиле невозможно.");
        }
    }

    public void GraveyardInfo(String[][] graves) {
        System.out.println("Информация о могилах:");

        for (int i = 0; i < graves.length; i++) {
            String[] grave = graves[i];
            System.out.println("Могила #" + (i + 1));
            System.out.println("Имя похороненного: " + grave[0]);
            System.out.println("Дата смерти: " + grave[1]);
            System.out.println("Описание: " + grave[2]);
            System.out.println();
        }
    }
    public void additionalActionsOnDestroy() {
        // Дополнительные действия, которые могут выполняться при разрушении кладбища
        System.out.println("Это место проклято, я не должен был здесь быть");
    }
    public void additionalActionsOnVisitGraveyard() {
        // Дополнительные действия, которые могут выполняться при посещении кладбища
        System.out.println("Я почувствовал холод, когда переступил порог кладбища. Мрачная атмосфера окутывает меня.");
    }
}
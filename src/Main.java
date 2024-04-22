import java.util.Scanner;

public class Main {

    private boolean isGraveyardDestroyed = false;

    public void destroyGraveyard() {
        isGraveyardDestroyed = true;
        System.out.println("Вы разрушили кладбище, эти души свободны, они вас никогда не забудут.");
    }

    public void printGraveyardHistory() {
        if (!isGraveyardDestroyed) {
            System.out.println("История кладбища: старое кладбище, построенное в 1967 году в Мухосранске. Здесь похоронены люди, " +
                    "которые не смогли сбежать из этого города, и теперь их души навсегда покоются здесь.");
        } else {
            System.out.println("Кладбище было уничтожено. Теперь здесь ничего нет.");
        }
    }

    public void additionalActionsOnDestroy() {
        System.out.println("Все ворота кладбища заколочены. Никто не покинет это место.");
    }

    public void printAdditionalGraveyardHistory() {
        System.out.println("В давние времена на кладбище происходили странные события...");
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

        while (choice != 10) {
            System.out.println("Меню:");
            System.out.println("1. Кто есть на кладбище");
            System.out.println("2. Уничтожить кладбище");
            System.out.println("3. История кладбища");
            System.out.println("4. Посетить кладбище");
            System.out.println("5. Добавить могилу на кладбище");
            System.out.println("6. Обновить информацию о могиле");
            System.out.println("7. История могил");
            System.out.println("8. Кремация сотрудника");
            System.out.println("9. Воскрешение сотрудника");
            System.out.println("10. Выход");

            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Main.displayEmployees(employees);
                    break;
                case 2:
                    main.destroyGraveyard();
                    main.additionalActionsOnDestroy(); 
                    break;
                case 3:
                    main.printGraveyardHistory();
                    main.printAdditionalGraveyardHistory(); 
                    break;
                case 4:
                    Main graveVisitor = new Main();
                    graveVisitor.visitGraveyard();
                    main.additionalActionsOnVisitGraveyard(); 
                    break;
                case 5:
                    Main graveAdder = new Main();
                    graveAdder.addGraveToGraveyard();
                    main.additionalActionsOnAddGrave(); 
                    break;
                case 6:
                    Main graveUpdater = new Main();
                    graveUpdater.updateGraveDetails();
                    break;
                case 7:
                    main.GraveyardInfo(main.graves);
                    break;
                case 8:
                    main.cremateEmployee(employees);
                    break;
                case 9:
                    main.resurrectEmployee(employees);
                    break;
                case 10:
                    System.out.println("Конец...");
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
            System.out.println("Я на территории кладбища. Тут пахнет гнилью и свежей мертвечиной");
        } else {
            System.out.println("Кладбище разрушено. Посещение невозможно.");
        }
    }

    public void addGraveToGraveyard() {
        if (!isGraveyardDestroyed) {
            System.out.println("Добавление новой могилы на кладбище...");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ФИО похороненного: ");
            String name = scanner.nextLine();
            System.out.print("Введите дату смерти: ");
            String date = scanner.nextLine();
            System.out.print("Введите описание могилы: ");
            String description = scanner.nextLine();

            System.out.println("Могила успешно добавлена: " + name + ", " + date + ", " + description);
        } else {
            System.out.println("Кладбище разрушено. Добавление могилы невозможно.");
        }
    }

    public void updateGraveDetails() {
        if (!isGraveyardDestroyed) {
            System.out.println("Обновление информации о могиле на кладбище...");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ФИО похороненного, данные о котором вы хотите обновить: ");
            String name = scanner.nextLine();

            System.out.print("Введите новое описание могилы: ");
            String newDescription = scanner.nextLine();

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

    public void additionalActionsOnVisitGraveyard() {
        System.out.println("Я почувствовал холод, когда переступил порог кладбища. Мрачная атмосфера окутывает меня.");
    }

    public void additionalActionsOnAddGrave() {
        System.out.println("Снова одна душа присоединилась к множеству в этом безжизненном мире.");
    }

    public void resurrectEmployee(String[][] employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя умершего для воскрешения: ");
        String nameToResurrect = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < employees.length; i++) {
            if (nameToResurrect.equalsIgnoreCase(employees[i][0]) &&
                    "Скремирован".equalsIgnoreCase(employees[i][1])) {

                System.out.println("Похороненный " + employees[i][0] + " был воскрешен.");
                employees[i][1] = employees[i][0];

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Невозможно воскресить умершего с именем " + nameToResurrect + ".");
        }
    }




    public void cremateEmployee(String[][] employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя сотрудника для кремации: ");
        String nameToCremate = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < employees.length; i++) {
            if (nameToCremate.equalsIgnoreCase(employees[i][0])) {
                System.out.println("Сотрудник " + employees[i][0] + " был сожжён заживо. ХЕХЕХЕ");
                // Удаляем похороненного из массива
                employees[i][0] = "ЗАКОНСЕРВИРОВАН"; 
                employees[i][1] = "ЗАКОНСЕРВИРОВАН"; 
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Рабочий с именем " + nameToCremate + " не найден.");
        }
    }
}

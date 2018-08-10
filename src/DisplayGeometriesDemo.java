import java.util.Scanner;

public class DisplayGeometriesDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tHIỂN THỊ HÌNH VẼ");
        System.out.println("Menu");
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Vẽ tam giác vuông cân có góc vuông ở vị trí bottom-left");
        System.out.println("3. Vẽ tam giác vuông cân có góc vuông ở vị trí top-right");
        System.out.println("4. Vẽ tam giác vuông cân có góc vuông ở vị trí top-left");
        System.out.println("5. Vẽ tam giác vuông cân có góc vuông ở vị trí bottom-right");
        System.out.println("6. Vẽ tam giác cân");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");

        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Hình chữ nhật");
                    System.out.println("Nhập vào chiều dài: ");
                    int width = scanner.nextInt();
                    System.out.println("Nhập vào chiều rộng: ");
                    int height = scanner.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Tam giác vuông cân có góc vuông ở vị trí bottom-left");
                    System.out.println("Nhập vào độ dài cạnh góc vuông");
                    height = scanner.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Tam giác vuông cân có góc vuông ở vị trí top-right");
                    System.out.println("Nhập vào độ dài cạnh góc vuông");
                    height = scanner.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height; j++) {
                            if (j >= i) {
                                System.out.print("* ");
                            } else System.out.print("  ");

                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Tam giác vuông cân có góc vuông ở vị trí top-left");
                    System.out.println("Nhập vào độ dài cạnh góc vuông");
                    height = scanner.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i + 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    break;
                case 5:
                    System.out.println("Tam giác vuông cân có góc vuông ở vị trí bottom-right");
                    System.out.println("Nhập vào độ dài cạnh góc vuông");
                    height = scanner.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height; j++) {
                            if (j >= height - i + 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Tam giác cân");
                    System.out.println("Nhập vào độ dài cạnh đáy của tam giác cân:");
                    int c = scanner.nextInt();
                    for (int i = 1; i <= (c + 1) / 2; i++) {
                        for (int j = 1; j <= c; j++) {
                            if (j > (c + 1) / 2 - i && j < (c + 1) / 2 + i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("NO CHOICE!");
            }
        }
    }
}

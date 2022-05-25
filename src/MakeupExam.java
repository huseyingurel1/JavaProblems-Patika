public class MakeupExam {
    public static void main(String[] args) {

        int vize1 = (int) (Math.random() * 101);
        int vize2 = (int) (Math.random() * 101);
        int finalNotu = (int) (Math.random() * 101);
        int ortalama1 = (int) (vize1 * 0.25 + vize2 * 0.25 + finalNotu * 0.50);

        if (ortalama1 >= 60) {
            System.out.println("vize1 = " + vize1);
            System.out.println("vize2 = " + vize2);
            System.out.println("finalNotu = " + finalNotu);
            System.out.println("ortalama1 = " + ortalama1);
            System.out.println("Dersi geçtiniz BÜTE GİREMEZSİNİZ");
        } else {
            System.out.println("vize1 = " + vize1);
            System.out.println("vize2 = " + vize2);
            System.out.println("finalNotu = " + finalNotu);
            ortalama1 = (int) (vize1 * 0.25 + vize2 * 0.25 + finalNotu * 0.50);
            System.out.println("ortalama1 = " + ortalama1);
            System.out.println("Finalden Kaldınız Büte Giriniz");
            System.out.println("*******************************************************");

            // büte girecekmi / girmeyecek mi? %50 olasılık yaziTura

            int yaziTura = (int) (Math.random() * 2);

            if (yaziTura == 1) {

                //BÜTE GİRİLEN DURUM
                System.out.println("Bütünleme Sınavı Sonuçları");
                System.out.println("vize1 = " + vize1);
                System.out.println("vize2 = " + vize2);
                int bütünlemeNotu = (int) (Math.random() * 101);
                System.out.println("bütünlemeNotu = " + bütünlemeNotu);
                int yeniOrtalamanız = (int) (vize1 * 0.25 + vize2 * 0.25 + bütünlemeNotu * 0.50);
                System.out.println("yeniOrtalamanız = " + yeniOrtalamanız);
                String butOrtalaması = (yeniOrtalamanız >= 60) ? "Bütten Geçtiniz" : "Bütten geçemedin";
                System.out.println("butOrtalaması = " + butOrtalaması);
            } else {

                //BÜTE GİRİLEMEYEN DURUM
                int olaylar = (int) (Math.random() * 5);
                System.out.println("olaylar = " + olaylar);
                switch (olaylar) {
                    case 1:
                        System.out.println("Hasta Olduğunuz için Büte Giremediniz");
                        break;
                    case 2:
                        System.out.println("Uyanamadığınız için Büte Giremediniz");
                        break;
                    case 3:
                        System.out.println("Otobüsü kaçırdığınız için Büte Giremediniz");
                        break;
                    case 4:
                        System.out.println("Geç kaldığınız için sınava giremediniz");
                        break;
                    default:
                        System.out.println("Sınavınız iptal Oldu");
                }
            }

        }

    }
}

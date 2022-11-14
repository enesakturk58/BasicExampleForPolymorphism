public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] baseKrediManagers= new BaseKrediManager[]
            {new AskerKrediManager(),new IhtiyacKrediManager(),new OgrenciKrediManager(),new TarimKrediManager()};

        for (BaseKrediManager kredi:baseKrediManagers){
            System.out.println(kredi.hesapla(100.00));
        }
    }
}
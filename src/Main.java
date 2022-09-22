public class Main {

    public static void main(String[] args) {

        /*
        Insertion Sort Projesi
        [22,27,16,2,18,6] ---> Insertion Sort

        [22,27,16,2,18,6]---->n
        [2,27,16,22,18,6]---->n-1
        [2,6,16,22,18,27]---->n-2
        [2,6,16,18,22,27]---->1

        Big-O --->  n+(n-1)+(n-2)...+1 ----> (n^2+n)/2 ---->  O(n^2)

        Dizi sıralandıktan sonra 18 sayısı ortada olacağı için Average Case kapsamında değerlendirilir.


        [7,3,5,8,2,9,4,15,6] ----> dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

        [7,3,5,8,2,9,4,15,6]---->n
        [2,3,5,8,7,9,4,15,6]---->n-1
        [2,3,4,8,7,9,5,15,6]---->n-2
        [2,3,4,5,7,9,8,15,6]---->n-3
        [2,3,4,5,6,9,8,15,7]---->n-4

         */

        /*
        Merge Sort Projesi

        [16,21,11,8,12,22]
        [16,21,11]      [8,12,22]
        [16] [21,11]    [8,12]  [22]
        [16] [11,21]    [8,12]  [22]
        [11,16,21]      [8,12,22]
        [8,11,12,16,21,22]

        Big-O ----> Her satırın Big-O Notation'ı O(n)'dir. Bütününde logn kere yapıldığı için
            Big-O Notation "O(nlogn)" olur.
         */

        /*
        Binary Search Tree Projesi

        [7,5,1,8,3,6,0,9,4,2]---->dizisinin Binary-Search-Tree aşamalarını yazınız.

            7 rakamından başlayıp onu root node olduğunu düşünerek en başa alalım.Ardından ikinci rakama geçelim.
            5 rakamı 7'ye bağlı olmakla beraber 7'den küçük olduğu için sol tarafına doğru yerleştirilir. Ardından
            3. rakam olan 1 gelir. 1 de 7 ve 5 rakamlarından küçük olduğu için sol tarafda 5' bağlı şekilde yerleştirilir.
            8 rakamı gelmektedir. 8 rakamı rootumuz olan 7 rakamından büyük olduğu için ona bağlı şekilde sağ tarafına
            yerleştirilir. Daha sonra dizide 3 rakamı gelir. 3 rakamı 7 ve 5'ten küçük olduğu için sol fakat 1 rakamından
            büyük olduğu için 1 rakamınında sağına doğru yerleştirilir.6 rakamı ise rootumuz 7 rakamından küçük olduğu
            için sol tarafına fakan 5 rakamından büyük olduğu içinde 5 rakamının sağ tarafına doğru yerleştirilir.
            0 rakamı ise root rakamımız 7'nin soluna doğru gidilerek 1rakamının soluna doğru yerleştirilir.
            9 rakamı ise hem root olan 7 rakamından hem de sağında bulunan 8 rakamından büyük olduğu ikisininde sağına
            yerleştirilir. 4 rakamı ise rootumuzundan küçük olduğu için sol tarafına doğru gidilir. 5 ve 6 rakamlarından
            küçük olduğu için onların soluna fakat 1,3 ve 0'dan büyük olduğu için onların sağına doğru yerleştirilir.
            Son olarak 2 rakamı root rakamı 7 den küçük olduğu için sola doğru gidilir. 3,5 ve 6 rakamlarından küçük
            olduğu için sol taraflarına gidilir. Fakat 0 ve 1'den büyük olduğu için onların sağına doğru yerleştirilir.


         */


    }
}

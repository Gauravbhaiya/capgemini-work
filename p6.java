public class p6 {
    
   
        public static void main(String[] args) {
            int fee = 125000;
            double discountPercent = 10;
            double discount = (discountPercent / 100) * fee;
            double discountedFee = fee - discount;
    
            System.out.println("The discount amount is INR " + discount +
                    " and final discounted fee is INR " + discountedFee);
        }
    }
    
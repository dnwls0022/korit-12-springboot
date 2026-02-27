package org.example.test5;

public class InventoryManager {
    public static void main(String[] args) {
        Product laptop = new Product("노트북", 10);
        int orderQuantity = 15;

        // TODO: try-catch 블록을 사용하여 laptop.decreaseStock()을 호출하고,
        // OutOfStockException을 처리하여 실행 예와 같이 출력하시오.
        try {
            laptop.decreaseStock(15);
            System.out.printf("현재재고 "+orderQuantity+ "개");
        }catch (OutOfStockException e){
            System.out.printf("재고부족: "+orderQuantity +"개 주문불가");

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    // TODO: Exception을 상속받는 OutOfStockException 클래스를 작성하시오
    public static class Product {
        private String name;
        private int stock;

        public Product(String name, int stock) {
            this.name = name;
            this.stock = stock;
        }

        public void decreaseStock(int quantity) throws OutOfStockException {
            // TODO: quantity가 stock보다 크면 OutOfStockException을 발생시키는 코드를 작성하시오.
            // 그렇지 않으면 stock을 quantity만큼 감소시킵니다.
            // 현재수량이 재고보다크다
            if (quantity>stock){
                throw new OutOfStockException("현재수량이 재고보다큽니다.");

            } else if (quantity<stock) {
                stock= -quantity;
            }

        }

        public int getStock() {
            return stock;
        }
    }
}

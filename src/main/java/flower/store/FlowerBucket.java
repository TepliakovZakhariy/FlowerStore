package flower.store;

public class FlowerBucket {
    private FlowerPack[] flowerBucket;

    public FlowerBucket() {
        this.flowerBucket = new FlowerPack[0];
    }

    public FlowerBucket(FlowerPack[] flowerPacks) {
        this.flowerBucket = flowerPacks.clone();
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerBucket) {
            price += flowerPack.getFlower().getPrice()
                    * flowerPack.getQuantity();
        }
        return price;
    }

    public void add(FlowerPack flowerPack) {
        FlowerPack[] newFlowerBucket = new FlowerPack[flowerBucket.length + 1];
        System.arraycopy(flowerBucket, 0, newFlowerBucket, 0,
                flowerBucket.length);
        newFlowerBucket[flowerBucket.length] = flowerPack;
        flowerBucket = newFlowerBucket;
    }
}

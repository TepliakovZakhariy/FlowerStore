package flower.store;

public class Store {
    private FlowerBucket flowerBucket;

    public Store() {
        this.flowerBucket = new FlowerBucket();
    }

    public Store(FlowerBucket flowerBucket) {
        this.flowerBucket = flowerBucket;
    }

    public FlowerPack[] search(FlowerSpec searchSpec) {
        FlowerPack[] searchResult = new 
        FlowerPack[flowerBucket.getFlowerBucket().length];
        int j = 0;
        for (FlowerPack flowerPack : flowerBucket.getFlowerBucket()) {
            if (flowerPack.getFlower().getFlowerSpec().matches(searchSpec)) {
                searchResult[j] = flowerPack;
                j++;
            }
        }
        return searchResult;

    }

}

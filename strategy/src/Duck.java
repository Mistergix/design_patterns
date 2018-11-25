abstract class Duck {
    FlyBehavior fly;

    void Fly() {
        fly.Fly();
    }

    void SetFlyBehavior(FlyBehavior fly) {
        this.fly = fly;
    }
}

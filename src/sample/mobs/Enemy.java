package sample.mobs;

public class Enemy implements Mob {
    private boolean isAlive = false;
    private int hitPoints = 0;
    private int damage = 0;

    @Override
    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void revive() {
        isAlive = true;
    }

    @Override
    public void isDead() {
        isAlive = false;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public void setHitPoints(int hitPoints) {
        if (hitPoints <= 0) {
            isAlive = false;
        } else {
            this.hitPoints = hitPoints;
        }
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm a Enemy.");
        System.out.println("| I'm " + (isAlive ? "alive" : "dead"));
        System.out.println("| Current hitPoints is " + hitPoints);
        System.out.println("| Current Damage is " + damage);
        System.out.println("------------------------------------\n");
    }

    @Override
    public void loseHitPoints() {
        System.out.println("Calculator: lower HitPoints");
        if (getHitPoints() > 9) {
            setHitPoints(getHitPoints() - 10);
        }
    }

    @Override
    public void increaseHitPoints() {
        System.out.println("Calculator: increase HitPoints");
        setHitPoints(getHitPoints() + 10);
    }

    @Override
    public void lowerDamage() {
        System.out.println("Calculator: lower Damage");
        if (getDamage() > 1) {
            setDamage(getDamage() - 1);
        }
    }

    @Override
    public void increaseDamage() {
        System.out.println("Calculator: increase Damage");
        setDamage(getDamage() + 1);
    }

    public void upgrade() {
        System.out.println("Calculator: upgrade");
        setHitPoints(getHitPoints() + 10);
        setDamage(getDamage() + 3);
    }
}

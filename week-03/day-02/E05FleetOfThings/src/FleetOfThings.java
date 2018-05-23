public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleetOfThings = new Fleet();

    Thing thing1 = new Thing("Get milk");
    Thing thing2 = new Thing("Remove the obstacles");
    Thing thing3 = new Thing("Stand up");
    Thing thing4 = new Thing("Eat lunch");

    thing3.complete();
    thing4.complete();

    fleetOfThings.add(thing1);
    fleetOfThings.add(thing2);
    fleetOfThings.add(thing3);
    fleetOfThings.add(thing4);

    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleetOfThings);
  }
}
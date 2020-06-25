package linkedlistlecture;

import java.util.LinkedList;

public class RealStateAgency {
    private LinkedList<House> agent;
    private House house;

    public RealStateAgency(){
        agent = new LinkedList<House>();
    }

    public void addHouse(){         // CRUD - Create
        house = new House(18.0,12.0);
        agent.add(house);
        house = new House(23.0,11.0);
        agent.add(house);
        house = new House(34.0,23.0);
        agent.add(house);
        house = new House(45.0,10.0);
        agent.add(house);
    }

    public void readHouse(){        // CRUD - Read
        for (int i = 0; i < agent.size(); i++) {
            System.out.println(agent.get(i).getHeight());
        }
    }

    public void updateHouse(){      // CRUD - Update
        house = new House(42.0,42.0);
        agent.set(2,house);
    }

    public void deleteHouse(){      // CRUD - Delete
        agent.remove(2);
    }
}

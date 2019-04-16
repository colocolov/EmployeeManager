package employeemanager.models;

/**
 * @author Стас
 */
public enum Position {
    Programmer("Programmer"),
    Accountant("Accountant"),
    HRManager("HR Manager"),
    Cleaner("Cleaner");

    private String customName;

    private Position(String name) {
        this.customName = name;
    }
    
    public String getName(){
        return this.customName;
    }
    
    @Override
    public String toString() {
        return customName;
    }
    
    public static Position getByPositiOnName(String positionName){
        for (Position pos : Position.values()){
            if (pos.customName.equals(positionName)){
                return pos;
            }
        }
        throw new IllegalArgumentException("Position does exist in the enum."); // эта оишбка больше для нас прогрмеров. 
        // после прохождения всего цикла если у нас есть enum который не подходит 
    }
}

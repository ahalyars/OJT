public class question54 {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            // Initialize variables to keep track of total gas, total cost, current gas, and starting station
            int totalGas = 0;
            int totalCost = 0;
            int currentGas = 0;
            int startStation = 0;
            // Loop through each gas station
            for (int i = 0; i < gas.length; i++) {
                // Accumulate the total gas and total cost
                totalGas += gas[i];
                totalCost += cost[i];
                // Calculate the current gas after reaching this station
                currentGas += gas[i] - cost[i];
    
                // If current gas is negative, reset the start station and current gas
                if (currentGas < 0) {
                    startStation = i + 1;
                    currentGas = 0;
                }
            }
            // Check if the total gas is sufficient to cover the total cost
            // If yes, return the starting station index, otherwise return -1
            return totalGas >= totalCost ? startStation : -1;
        }
     public static void main(String[] args) {
            question54 gs = new question54();
            // Example gas and cost arrays
            int[] gas = {1, 2, 3, 4, 5};
            int[] cost = {3, 4, 5, 1, 2};
            // Output should be 3, indicating the starting station index to complete the circuit
            System.out.println(gs.canCompleteCircuit(gas, cost)); 
        }
    }
    
    


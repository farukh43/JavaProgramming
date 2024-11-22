package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//falt map, map and count etc.. are terminal operations

//Non Terminal Methods
//distinct
//limit
//forEach

//Also know as Non terminal operations

public class StreamMethodsDemo {

	public static void main(String[] args) {
		List <String> vehicleList = Arrays.asList("bus","car","bicycle","car","car","bike");
		
		//Distinct
		//List <String> distinctVehicle = vehicleList.stream().distinct().collect(Collectors.toList());
		//System.out.println(distinctVehicle);
		
		vehicleList.stream().distinct().forEach(value->System.out.println(value));
		
		//count
		long count =vehicleList.stream().distinct().count();
		//int type is not suitable
		System.out.println(count);
		
		//limit
		List <String> limitedVehicleList =vehicleList.stream().distinct().limit(3).collect(Collectors.toList());
		System.out.println(limitedVehicleList);
		
		vehicleList.stream().limit(3).forEach(value->System.out.println(value));
		

	}

}

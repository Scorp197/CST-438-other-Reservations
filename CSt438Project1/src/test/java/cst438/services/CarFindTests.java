//package cst438.services;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//
//import java.util.List;
//
//import org.assertj.core.internal.Lists;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import cst438.domain.CarFind;
//import cst438.domain.Package;
//import cst438.domain.PackageRepository;
//
//
//
//
//public class CarFindTests {
//
//	public class CarFindTest {
//		@MockBean
//		private PackageRepository packageRepository;
//	
//@Test
//  public String testCarReservationReservedDate() throws Exception
//  { 
//		
//	  //Check if a car is reserved on a specific date
//	  String reserveDate  = "2021-10-2";
//	  Package packageDeal = new Package();
//	  Iterable<Package> project1 = packageRepository.findAll();
//	  List<Package> package = List.new Array(new Package(reserveDate));
//	  
//	//given
//		given(CarFind.getReserveDate()).willReturn(
//				new reserveDate(reserveDate));
//		
//		//when
//		CarFind actual = CarFind.getReserveDate(reserveDate);
//		
//		//then
//		
//		CarFind expected = new CarFind(reserveDate);
//		assertEquals(expected, actual);
//	  
//  		}
//	}
//	
//	@Test
//	public void testCityNotFound() {
//		List<Package> empty = Lists.new ArrayList();
//		//given
//		
//		given(PackageRepository.getReserveDate(anyString())).willReturn(null);
//		
//		//when
//		CarFind actual = CarFind.getreserveDate("2021-10-2");
//		
//		//then
//		assertNull(actual);
//	}
//}	
//
//
//
//

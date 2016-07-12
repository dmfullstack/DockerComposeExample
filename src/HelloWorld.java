import redis.clients.jedis.Jedis;

public class HelloWorld {

	public static void main(String args[]) {
		System.out.println("Going to start the PING operation for Redis Server");

		Jedis jedis = new Jedis("redis");
		while(true) {
			try {
				Thread.sleep(4000); // This is done to avoid the server getting pinged conrinuously

				System.out.println("Redis Server Running Status : "+jedis.ping());
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

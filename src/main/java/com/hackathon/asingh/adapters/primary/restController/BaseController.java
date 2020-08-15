package  com.hackathon.asingh.adapters.primary.restController ;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.hackathon.asingh.corelogic.models.InvalidUser;

public abstract class BaseController
{
	protected ResponseEntity<Map<String,Object>> execute(Runnable block, HttpStatus successHttpStatus)
	{
		Map<String,Object> json = new HashMap<>();
		try
		{
			block.run();
			json.put("data", null);
			return new ResponseEntity<>(json,successHttpStatus);
		}
		catch(Exception e)
		{
			if(e instanceof InvalidUser)
				return new ResponseEntity<>(json,HttpStatus.FORBIDDEN);
			throw e;
		}
	}
		
	protected <A> ResponseEntity<Map<String, Object>> execute (Supplier<A> block)
	{
		A result = block.get();
		Map<String, Object> json = new HashMap<>();
		json.put("data", result);
		return new ResponseEntity<>(json, result != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
	}
	

}

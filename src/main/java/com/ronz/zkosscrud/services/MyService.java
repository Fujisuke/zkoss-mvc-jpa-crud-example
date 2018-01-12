package com.ronz.zkosscrud.services;

import com.ronz.zkosscrud.entity.Log;
import java.util.List;

public interface MyService {

	Log addLog(Log log);

	List<Log> getLogs();

	void deleteLog(Log log);
}

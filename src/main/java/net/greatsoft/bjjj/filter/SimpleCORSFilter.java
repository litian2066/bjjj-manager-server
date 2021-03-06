package net.greatsoft.bjjj.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import net.greatsoft.bjjj.entity.system.UserSystem;
import net.greatsoft.bjjj.util.constants.SystemConstants;
import net.greatsoft.bjjj.web.dto.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

@Component
public class SimpleCORSFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods",
				"POST, GET, PUT, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers",
				"Origin, X-Requested-With, Content-Type, Accept, token");
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		// 获取访问的url
		String servletPath = request.getServletPath();
		System.out.println("访问链接:" + servletPath);
		/*if (servletPath.contains("login")) {
			chain.doFilter(request, response);
		} else {
			String token = request.getHeader("token");
			if (token == null) {
				try (PrintWriter out = response.getWriter()) {
					ResultDto ro = new ResultDto(ResultDto.TOKEN_FAIL,
							"您尚未登录, 请先登录", null);
					out.write(JSON.toJSONString(ro));
				}
			} else {
				chain.doFilter(request, response);
			}
		}*/

		chain.doFilter(request, response);


		
		// 排除特定请求
		/*Pattern pattern = Pattern.compile(
				"/(org/query)|(login/getCaptcha)|(login/login)|(login/findLoginInfo)|(system/findUsersByDepartmentId)|(fileDownload/downloadFile)|(exportExcel/common)|(exportExcel/download)");
		if (pattern.matcher(servletPath).find()) { // 登录,退出系统
			chain.doFilter(request, response);
		}
		// 未登录
		else if (CommonUtils.isBlankOrEmpty(token)) {
			try (PrintWriter out = response.getWriter()) {
				ResultDto ro = new ResultDto(ResultDto.TOKEN_FAIL,
						"您尚未登录, 请先登录", null);
				out.write(JSON.toJSONString(ro));
			}
		}
		// 从redis中查询,根据token查询用户的id
		else {
			User user = (User) cacheRedisDao.get(token);
			if (user == null) {
				try (PrintWriter out = response.getWriter()) {
					ResultDto ro = new ResultDto(ResultDto.TOKEN_FAIL, token, out);
					ro.setCode(ResultDto.TOKEN_FAIL);
					ro.setMessage("您长时间未操作系统, 请重新登录");
					out.write(JSON.toJSONString(ro));
				}
			} else {
				request.setAttribute("userId", user.getId());
				// 延长令牌时间
				cacheRedisDao.set(token, user);
				// cacheRedisDao.set(token, user.getUsersId(), 30l,
				// TimeUnit.MINUTES);
				chain.doFilter(request, response);
			}
		}*/
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}

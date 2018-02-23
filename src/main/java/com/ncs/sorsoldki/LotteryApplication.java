package com.ncs.sorsoldki;

import com.ncs.sorsoldki.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LotteryApplication implements CommandLineRunner
{
	@Autowired
	private UserInfoRepository userInfoRepository;

	public static void main(String[] args) {
		SpringApplication.run(LotteryApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(userInfoRepository.findByDisplayName("SuperAdmin"));
	}
}

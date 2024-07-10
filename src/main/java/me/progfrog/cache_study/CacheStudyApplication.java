package me.progfrog.cache_study;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@RequiredArgsConstructor
@EnableJpaAuditing
public class CacheStudyApplication implements ApplicationRunner {

	private final UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CacheStudyApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		userRepository.save(User.builder().name("frog01").email("a@a.com").build());
		userRepository.save(User.builder().name("frog02").email("b@b.com").build());
		userRepository.save(User.builder().name("frog03").email("c@c.com").build());
		userRepository.save(User.builder().name("frog04").email("d@d.com").build());
		userRepository.save(User.builder().name("frog05").email("e@e.com").build());
		userRepository.save(User.builder().name("frog06").email("f@f.com").build());
		userRepository.save(User.builder().name("frog07").email("g@g.com").build());
		userRepository.save(User.builder().name("frog08").email("h@h.com").build());
		userRepository.save(User.builder().name("frog09").email("i@i.com").build());
		userRepository.save(User.builder().name("frog10").email("j@j.com").build());
	}
}

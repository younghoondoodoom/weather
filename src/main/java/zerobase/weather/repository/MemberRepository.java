package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zerobase.weather.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

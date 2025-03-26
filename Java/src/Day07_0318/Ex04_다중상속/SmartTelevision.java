package Day07_0318.Ex04_다중상속;

import java.text.MessageFormat;

public class SmartTelevision implements SmartRemoteControl, Searchable {

	int    volume;		// 볼륨
	int    channel;		// 채널
	String keyword;		// 검색어
	int    x, y;		// 터치패드 좌표

	@Override
	public void turnOn() {
		System.out.println("전원 ON");
	}

	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("volume : " + volume);
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("channel : " + channel);

	}

	@Override
	public String receiveVoice(String voice) {
		System.out.println("음석 입력 : " + voice);
		return "voice : " + voice;
	}

	@Override
	public void touch(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("(x, y) : " + MessageFormat.format("{},{}", x, y));
	}

	@Override
	public int channelSearche(String keyword) {
		int channel = 0;
		switch (keyword) {
			case "SBS":		channel = 5;	break;
			case "KBS":		channel = 7;	break;
			case "MBC":		channel = 11;	break;
			case "Mnet":	channel = 27;	break;
			case "ENA":		channel = 30;	break;
		}
		return channel;
	}

	@Override
	public String[] contentSearch(String keyword) {
		String[] movieContents     = { "포레스트 검프", "신세계", "러덜리스", "마녀", "말할수 없는 비밀" };
		String[] idolContents      = { "아이브", "에스파", "블랙핑크", "BTS", "뉴진스" };
		String[] recommentContents = { "이영지", "탁재훈", "오해원", "경영자들", "핑계고", "굿데이" };

		switch (keyword) {
			case "영화":
				return movieContents;
			case "아이돌":
				return idolContents;
			case "추천컨테츠":
			default:
				return recommentContents;
		}
	}

}


public class CampaignInformation {

	private int id;
	private String CampaignName;
	private int CampaignDuration;
	private double CampaignDiscount;
	public CampaignInformation(int id, String campaignName, int campaignDuration, double campaignDiscount) {
		super();
		this.id = id;
		CampaignName = campaignName;
		CampaignDuration = campaignDuration;
		CampaignDiscount = campaignDiscount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return CampaignName;
	}
	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}
	public int getCampaignDuration() {
		return CampaignDuration;
	}
	public void setCampaignDuration(int campaignDuration) {
		CampaignDuration = campaignDuration;
	}
	public double getCampaignDiscount() {
		return CampaignDiscount;
	}
}
	
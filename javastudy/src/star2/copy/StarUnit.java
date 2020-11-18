package star2.copy;

interface StarUnit {			//�θ� Ŭ���� 
	public void attack(StarUnit u);
	public void upgrade();
	public void dead(StarUnit u);
	public String getName();
	public int getHp();
	public int getAttack();
	public void setName(String name);
	public void setHp(int hp);
	public void setAttack(int attack);
}

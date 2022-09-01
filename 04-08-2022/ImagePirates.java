class ImagePirates
{
public static void main(String [] args)
{
         Image image=new Image(12,220,"round Shape",6);
		 image.setMaterial(ImageFrame.GLASS);
         Color[] h={Color.RED,Color.WHITE,Color.BROWN};
		 image.setColor(h);
		 image.printData();
}
}
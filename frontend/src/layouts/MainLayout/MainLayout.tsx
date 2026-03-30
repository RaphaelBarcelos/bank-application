import { Header } from '../../components/Header/Header';
import { Footer } from '../../components/Footer/Footer';
import './MainLayout.css';

type Props = {
    children: React.ReactNode;
}

export function MainLayout({ children }: Props) {
    return (
        <>
            <Header />
            <main>
                {children}
            </main>
            <Footer />
        </>
    )
}
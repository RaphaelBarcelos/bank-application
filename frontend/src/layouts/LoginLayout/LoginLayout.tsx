import { Header } from '../../components/Header/Header';
import { Footer } from '../../components/Footer/Footer';
import './LoginLayout.css';

type Props = {
    children: React.ReactNode;
}

export function LoginLayout({ children }: Props) {
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